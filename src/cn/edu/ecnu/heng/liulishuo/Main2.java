package cn.edu.ecnu.heng.liulishuo;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] itmes = scanner.nextLine().split(" ");
		scanner.close();
		for (int i = itmes.length - 1; i > -1; i--) {
			System.out.print(itmes + " ");
		}
	}
}
