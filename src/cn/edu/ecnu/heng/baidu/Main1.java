package cn.edu.ecnu.heng.baidu;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		long m = scanner.nextLong();
		scanner.close();
		System.out.println(n - 2 * m + 1);
	}

}
