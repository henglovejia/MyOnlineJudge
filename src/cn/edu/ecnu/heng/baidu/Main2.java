package cn.edu.ecnu.heng.baidu;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {

	public static class Node implements Comparable<Node> {
		public int a, b, v;

		public Node(int a, int b, int v) {
			this.a = a;
			this.b = b;
			this.v = v;
		}

		@Override
		public int compareTo(Node node) {
			// this.data - node.data >= 0 则升序
			return this.v - node.v;
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int k = scanner.nextInt();
		Node[] nodes = new Node[k + m];
		for (int i = 0; i < m; i++) {
			nodes[i] = new Node(scanner.nextInt() - 1, scanner.nextInt() - 1, 0);
		}
		for (int i = 0; i < k; i++) {
			nodes[i + m] = new Node(scanner.nextInt() - 1, scanner.nextInt() - 1, scanner.nextInt());
		}
		scanner.close();
		Arrays.sort(nodes);
		System.out.println(createMinSpanTreeKruskal(n, nodes));
	}

	public static int createMinSpanTreeKruskal(int n, Node[] nodes) {
		int[] parent = new int[n];
		for (int i = 0; i < n; i++) {
			parent[i] = 0;
		}

		int sum = 0;
		for (Node edge : nodes) {
			int start = find(parent, edge.a);
			int end = find(parent, edge.b);
			if (start != end) {
				parent[start] = end;
				sum += edge.v;
			}
		}
		return sum;
	}

	private static int find(int parent[], int index) {
		while (parent[index] > 0) {
			index = parent[index];
		}
		return index;
	}

}
