package cn.edu.ecnu.heng.template;

import java.util.Scanner;

public class Main1 {

	public static class Node implements Comparable<Node> {
		public Object data;

		public Node(Object data) {
			this.data = data;
		}

		@Override
		public int compareTo(Node node) {
			// this.data - node.data >= 0 则升序
			return 0;
		}

	}

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
