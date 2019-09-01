package cn.edu.ecnu.heng.unity;

import java.util.Scanner;

public class Main3 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] list = new int[n];
		for (int i = 0; i < n; i++) {
			list[i] = scanner.nextInt();
		}
		scanner.close();
		for(int i=0;i<n;i++) {
			int y = 0;
			for(int j=i+1;j<n;j++) {
				if(list[i] > list[j]) {
					y++;
				}
			}
			System.out.print(y + " ");
		}
	}

}
