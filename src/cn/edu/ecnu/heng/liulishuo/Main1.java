package cn.edu.ecnu.heng.liulishuo;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		scanner.close();
		String[] items = line.split("\\.");
		if (items.length != 4) {
			System.out.println("false");
			return;
		}
		for (String item : items) {
			try {
				if(item.length()>3) {
					System.out.println("false");
					return;
				}
				Integer number = Integer.parseInt(item);
				if (!item.equals(number + "")) {
					System.out.println("false");
					return;
				}
				if (number > 255 && number < 0) {
					System.out.println("false");
					return;
				}
			} catch (Exception e) {
				System.out.println("false");
				return;
			}
		}
		System.out.println("true");
	}
}
