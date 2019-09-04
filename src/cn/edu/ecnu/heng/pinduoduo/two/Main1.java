package cn.edu.ecnu.heng.pinduoduo.two;

import java.util.Arrays;
import java.util.Scanner;

public class Main1 {

	public static class Node implements Comparable<Node> {
		public Integer data;
		private boolean flag;

		public Node(Integer data) {
			this.data = data;
			flag = data % 2 == 0 ? true : false;
		}

		@Override
		public int compareTo(Node node) {
			// this.data - node.data >= 0 则升序
			if (flag ^ node.flag) {
				if (flag) {
					return -1;
				} else {
					return 1;
				}
			} else {
				return node.data - data;
			}
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] items = scanner.nextLine().split(";");
		scanner.close();
		String[] datas = items[0].split(",");
		int n = Integer.parseInt(items[1]);
		Node[] nodes = new Node[datas.length];
		for (int i = 0; i < datas.length; i++) {
			nodes[i] = new Node(Integer.parseInt(datas[i]));
		}
		Arrays.sort(nodes);
		for (int i = 0; i < n; i++) {
			if (i == n - 1) {
				System.out.print(nodes[i].data);
			} else {
				System.out.print(nodes[i].data + ",");
			}
		}
	}

}
