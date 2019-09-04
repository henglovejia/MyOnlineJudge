package cn.edu.ecnu.heng.pinduoduo.two;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {

	public static void sort(String oldStr, String newStr, int index, int left, int right, List<String> opts) {
		if (index == oldStr.length()) {
			if(right - left == newStr.length() - 1) {
				for (String opt : opts) {
					System.out.print(opt + " ");
				}
				System.out.println();
			}
			return;
		}
		if (left != -1 && right - left == newStr.length() - 1) {
			for (String opt : opts) {
				System.out.print(opt + " ");
			}
			System.out.println();
			return;
		}
		if (left == -1) {
			if (newStr.indexOf(oldStr.charAt(index)) == -1) {
				opts.add("d");
				sort(oldStr, newStr, index + 1, -1, -1, opts);
			} else {
				for (int i = 0; i < newStr.length(); i++) {
					if (newStr.charAt(i) == oldStr.charAt(index)) {
						List<String> l = new ArrayList<>(opts);
						l.add("l");
						sort(oldStr, newStr, 1, i, i, l);
						List<String> r = new ArrayList<>(opts);
						r.add("r");
						sort(oldStr, newStr, 1, i, i, r);
					}
				}
			}
		} else {
			if (left > 0) {
				if (newStr.charAt(left - 1) == oldStr.charAt(index)) {
					List<String> l = new ArrayList<>(opts);
					l.add("l");
					sort(oldStr, newStr, index + 1, left - 1, right, l);
				}
			}
			if (right < newStr.length()-1) {
				if (newStr.charAt(right + 1) == oldStr.charAt(index)) {
					List<String> r = new ArrayList<>(opts);
					r.add("r");
					sort(oldStr, newStr, index + 1, left, right + 1, r);
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < n; i++) {
			String oldStr = scanner.nextLine();
			String newStr = scanner.nextLine();
			System.out.println("{");
			sort(oldStr, newStr, 0, -1, -1, new ArrayList<>());
			System.out.println("}");
		}
		scanner.close();
	}

}
