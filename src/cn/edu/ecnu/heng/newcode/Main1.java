package cn.edu.ecnu.heng.newcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

import com.sun.org.apache.regexp.internal.recompile;

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
		return n+1;
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

	public static void main(String[] args) {
		Main1 main = new Main1();
		System.out.println(main.tableSizeFor(1024));
	}

}
