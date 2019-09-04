package cn.edu.ecnu.heng.tencent.three;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] line = scanner.nextLine().split(" ");
		int n = Integer.parseInt(line[0]);
		int m = Integer.parseInt(line[1]) - 1;
		int k = Integer.parseInt(line[2]);
		int[] c = new int[k];
		int flag = n + 1;
		int index = 0;
		List<Integer> list = new LinkedList<Integer>();
		for (int i = 1; i <= n; i++) {
			list.add(i);
		}
		for (int i = 0; i < k; i++) {
			c[i] = Integer.parseInt(scanner.nextLine());
		}
		for (int i = 0; i < k; i++) {
			index = (index + m) % (list.size());
			System.out.println(list.remove(index));
			for (int j = 0; j < c[i]; j++) {
				list.add(index + j, flag++);
			}
		}
		scanner.close();
	}

}
