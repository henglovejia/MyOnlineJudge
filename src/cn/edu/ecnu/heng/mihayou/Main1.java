package cn.edu.ecnu.heng.mihayou;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine().toLowerCase();
		scanner.close();
		int start, end;
		int[] count = new int[26];
		char[] c = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
				'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		for (start = 0, end = 0; start < line.length() && end < line.length(); end++) {
			if (line.charAt(end) <= '9' && line.charAt(end) > '0') {
				int times = Integer.parseInt(line.charAt(end) + "");
				String item = line.substring(start, end);
				int index = item.indexOf("-");
				while (index != -1) {
					StringBuilder sBuilder = new StringBuilder();
					boolean needAdd = item.charAt(index - 1) > item.charAt(index + 1);
					for (int i = item.charAt(index - 1) - 'a' + 1; i < (item.charAt(index + 1) - 'a'
							+ (needAdd ? 26 : 0)); i++) {
						sBuilder.append(c[i % 26]);
					}
					item = item.substring(0, index) + sBuilder.toString() + item.substring(index + 1);
					index = item.indexOf("-");
				}
				for (int i = 0; i < item.length(); i++) {
					count[item.charAt(i) - 'a'] += times;
				}
				start = ++end;
			}
		}
		int max = -1;
		int maxIndex = -1;
		for (int i = 0; i < 26; i++) {
			if (max < count[i]) {
				max = count[i];
				maxIndex = i;
			}
		}
		System.out.println(c[maxIndex] + "" + max);
	}

}
