package cn.edu.ecnu.heng.bytedance;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int money = 1024 - scanner.nextInt();
		scanner.close();
		int num_64 = money / 64;
		money -= num_64 * 64;
		if (money == 0) {
			System.out.println(num_64);
			return;
		}
		int num_16 = money / 16;
		money -= num_16 * 16;
		if (money == 0) {
			System.out.println(num_64 + num_16);
			return;
		}
		int num_4 = money / 4;
		money -= num_4 * 4;
		System.out.println(num_64 + num_16 + num_4 + money);
	}

}
