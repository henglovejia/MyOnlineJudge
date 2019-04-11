package cn.edu.ecnu.heng.huawei;

import java.util.Scanner;

public class Main2 {

	public static String repeatString(Integer times, String word) {
		StringBuilder sBuilder = new StringBuilder();
		for (int i = 0; i < times; i++) {
			sBuilder.append(word);
		}
		return sBuilder.toString();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		scanner.close();
		do {
			int start = 0, startMax = 0, startMid = 0, startMin = 0;
			for (int i = 0; i < line.length(); i++) {
				if (line.charAt(i) == '{') {
					startMax = i;
					continue;
				}
				if (line.charAt(i) == '[') {
					startMid = i;
					continue;
				}
				if (line.charAt(i) == '(') {
					startMin = i;
					continue;
				}
				switch (line.charAt(i)) {
				case '}':
					start = startMax;
					break;
				case ']':
					start = startMid;
					break;
				case ')':
					start = startMin;
					break;
				}
				if (line.charAt(i) == '}' || line.charAt(i) == ']' || line.charAt(i) == ')') {
					line = line.substring(0, start - 1)
							+ repeatString(Integer.parseInt(line.charAt(start - 1) + ""), line.substring(start + 1, i))
							+ line.substring(i + 1);
					break;
				}
			}
		} while (line.contains("("));
		for (int i = line.length() - 1; i > -1; i--) {
			System.out.print(line.charAt(i));
		}
	}

}
