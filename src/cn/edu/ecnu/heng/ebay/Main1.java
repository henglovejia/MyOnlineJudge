package cn.edu.ecnu.heng.ebay;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int length = line.length();
		scanner.close();
		StringBuilder sBuilder;
		StringBuilder output = new StringBuilder();
		for (int i = 1; i <= length; i++) {
			sBuilder = new StringBuilder();
			if (length % i == 0) {
				int time = length / i;
				String item = line.substring(0, i);
				for (int j = 0; j < time; j++) {
					sBuilder.append(item);
					if (line.indexOf(sBuilder.toString()) == -1) {
						break;
					}
				}
				if (line.equals(sBuilder.toString())) {
					output.append("1");
				} else {
					output.append("0");
				}
			} else {
				int time = length / i + 1;
				String item = line.substring(0, i);
				for (int j = 0; j < time; j++) {
					sBuilder.append(item);
					if (j < time - 1 && line.indexOf(sBuilder.toString()) == -1) {
						break;
					}
				}
				if (sBuilder.toString().indexOf(line) == 0) {
					output.append("1");
				} else {
					output.append("0");
				}
			}
		}
		System.out.println(output.toString());
	}

}
