package cn.edu.ecnu.heng.tencent;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int exp = n % k == 0 ? n / k : n / k + 1;
		System.out.println(exp*2);
		scanner.close();
	}

}
