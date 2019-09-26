package cn.edu.ecnu.heng.zhaoshangxyk;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		scanner.close();
		int[] count = new int[line.length()];
		int start = 0;
		int end = line.indexOf("RL", start);
		while (end != -1) {
			int num = end - start;
			if(num != 0) {
				if(line.charAt(start) == 'R') {
					count[end] = num / 2 + 1;
					count[end + 1] = (num & 1) == 1 ? count[end] + 1 : count[end];
				}else {
					count[start-1] += num / 2;
					count[start - 2] += (num & 1) == 1 ? num / 2 + 1 : num / 2;
					count[end] = 1;
					count[end+1] = 1;
				}
			}else {
				count[end] = 1;
				count[end+1] = 1;
			}
			start = end + 2;
			end = line.indexOf("RL", start);
		}
		if (start != line.length()) {
			int num = line.length() - start;
			count[start - 1] += num / 2;
			count[start - 2] += (num & 1) == 1 ? num / 2 + 1 : num / 2;
		}
		for (int i = 0; i < count.length; i++) {
			System.out.print(count[i] + " ");
		}
	}

}
