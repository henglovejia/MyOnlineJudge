package cn.edu.ecnu.heng.ea;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		List<String> query = new ArrayList<String>();
		int[] count = new int[n];
		scanner.nextLine();
		for (int i = 0; i < n; i++) {
			query.add(scanner.nextLine());
		}
		int m = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < m; i++) {
			String name = scanner.nextLine();
			for (int j = 0; j < n; j++) {
				if (name.indexOf(query.get(j)) == 0) {
					count[j]++;
				}
			}
		}
		scanner.close();
		for (int i = 0; i < n; i++) {
			System.out.println(count[i]);
		}
	}

}
