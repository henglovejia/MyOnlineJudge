package cn.edu.ecnu.heng.xiaohongshu;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		scanner.close();
		String[] items = line.replaceAll("\\s{1,}", " ").split(" ");
		for (int i = items.length - 1; i > -1; i--) {
			System.out.print(items[i] + " ");
		}
	}

}
