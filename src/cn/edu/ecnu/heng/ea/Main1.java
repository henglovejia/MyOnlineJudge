package cn.edu.ecnu.heng.ea;

import java.util.Scanner;

public class Main1 {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] list = new int[n];
		for (int i = 0; i < n; i++) {
			list[i] = scanner.nextInt();
		}
		scanner.close();
	}

}
