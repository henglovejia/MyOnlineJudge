package cn.edu.ecnu.heng.pinduoduo.two;

import java.util.Scanner;

public class Main4 {
	
	public static class Node<T> implements Comparable<Node<T>> {
		public T data;

		public Node(T data) {
			this.data = data;
		}

		@Override
		public int compareTo(Node<T> node) {
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
