package cn.edu.ecnu.heng.tencent.three;

import java.util.Arrays;
import java.util.Scanner;

public class Main4 {

	public static class Node implements Comparable<Node> {
		public Integer a, b;

		public Node(Integer a, Integer b) {
			this.a = a;
			this.b = b;
		}

		@Override
		public int compareTo(Node node) {
			if (a == node.a) {
				return b - node.b;
			}
			return node.a - a;
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Node[] list = new Node[n];
		for (int i = 0; i < n; i++) {
			list[i] = new Node(scanner.nextInt(), scanner.nextInt());
		}
		scanner.close();
		Arrays.sort(list);
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += (list[i].a * i + list[i].b * (n - i - 1));
		}
		System.out.println(sum);
	}

}
