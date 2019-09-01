package cn.edu.ecnu.heng.newcode;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main1 {

	public class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;

		}
	}

	public class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}

	public static class NestedData implements Comparable<NestedData> {

		public NestedData() {

		}

		@Override
		public int compareTo(NestedData data) {
			return 0;
		}

	}

	public boolean Find(int target, int[][] array) {
		int maxline = array[0].length;
		for (int[] line : array) {
			for (int i = 0; i < maxline; i++) {
				if (line[i] == target) {
					return true;
				}
				if (line[i] > target) {
					maxline = i + 1;
				}
			}
		}
		return false;
	}

	public String replaceSpace(StringBuffer str) {
		return str.toString().replace(" ", "%20");
	}

	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		if (listNode == null) {
			return new ArrayList<Integer>();
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (listNode != null) {
			list.add(0, listNode.val);
			listNode = listNode.next;
		}
		return list;
	}

	public int tableSizeFor(int cap) {
		int n = cap;
		n |= n >>> 1;
		n |= n >>> 2;
		n |= n >>> 4;
		n |= n >>> 8;
		n |= n >>> 16;
		return n + 1;
	}

	public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		if (root == null) {
			return new ArrayList<>();
		}
		LinkedList<TreeNode> list = new LinkedList<>();
		ArrayList<Integer> out = new ArrayList<>();
		list.add(root);
		while (!list.isEmpty()) {
			TreeNode head = list.remove(0);
			out.add(head.val);
			if (head.left != null) {
				list.add(head.left);
			}
			if (head.right != null) {
				list.add(head.right);
			}
		}
		return out;
	}

	public static ArrayList<Integer> printMatrix(int[][] matrix) {
		int row = 0, col = 0;
		int N = matrix.length;
		int M = matrix[0].length;
		int showNum = 0;
		int[][] target = new int[N][M];
		int direction = 0;
		ArrayList<Integer> output = new ArrayList<>(N * N);
		while (true) {
			switch (direction) {
			case 0:
				for (; col < M && target[row][col] != 1; col++) {
					output.add(matrix[row][col]);
					target[row][col] = 1;
					showNum++;
				}
				col--;
				row++;
				direction = 1;
				break;
			case 1:
				for (; row < N && target[row][col] != 1; row++) {
					output.add(matrix[row][col]);
					target[row][col] = 1;
					showNum++;
				}
				row--;
				col--;
				direction = 2;
				break;
			case 2:
				for (; col > -1 && target[row][col] != 1; col--) {
					output.add(matrix[row][col]);
					target[row][col] = 1;
					showNum++;
				}
				col++;
				row--;
				direction = 3;
				break;
			case 3:
				for (; row > -1 && target[row][col] != 1; row--) {
					output.add(matrix[row][col]);
					target[row][col] = 1;
					showNum++;
				}
				row++;
				col++;
				direction = 0;
				break;
			}
			if (showNum >= N * M) {
				break;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		int[][] matrix = new int[5][1];
		matrix[0][0]=1;
		matrix[1][0]=2;
		matrix[2][0]=3;
		matrix[3][0]=4;
		matrix[4][0]=5;
		System.out.println(printMatrix(matrix));
	}

}
