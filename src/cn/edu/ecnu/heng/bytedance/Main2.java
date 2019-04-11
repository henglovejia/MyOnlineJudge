package cn.edu.ecnu.heng.bytedance;

import java.util.Scanner;

public class Main2 {
	public static boolean three(char one, char two, char three) {

		return false;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		for (int i = 0; i < num; i++) {
			String section = scanner.nextLine();
			int max = section.length() - 3;
			for (int j = 0; j < max;) {
				if (section.charAt(j) == section.charAt(j + 1)) {
					char one = section.charAt(j);
					System.out.print(one + one);
					j += 2;
					for (int k = j; k < section.length();) {
						if (one == section.charAt(k)) {
							k++;
							continue;
						}
						char three = section.charAt(k++);
						System.out.print(three);
						for(;k<section.length();) {
							if (three == section.charAt(k)) {
								k++;
							}else {
								System.out.print(section.charAt(k));
								break;
							}
						}
						j = k;
					}
				} else {
					System.out.print(section.charAt(j++) + section.charAt(j++));
				}
			}
			System.out.println();
		}
		scanner.close();
	}

}
