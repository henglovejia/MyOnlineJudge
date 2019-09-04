package cn.edu.ecnu.heng.xiecheng;

import java.util.Scanner;

public class Main2 {

	static String sortVersion(String s1, String s2) {
		String[] items = s1.split("\\.");
		int[] d1 = new int[items.length];
		for (int i = 0; i < items.length; i++) {
			d1[i] = Integer.parseInt(items[i]);
		}
		items = s2.split("\\.");
		int[] d2 = new int[items.length];
		for (int i = 0; i < items.length; i++) {
			d2[i] = Integer.parseInt(items[i]);
		}
		for (int i = 0; i < d1.length && i < d2.length; i++) {
			if (d1[i] != d2[i]) {
				if (d1[i] < d2[i]) {
					return s1 + "," + s2;
				}
				return s2 + "," + s1;
			}
		}
		if (d1.length < d2.length) {
			return s1 + "," + s2;
		}
		return s2 + "," + s1;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String res;

		String _s1;
		try {
			_s1 = in.nextLine();
		} catch (Exception e) {
			_s1 = null;
		}

		String _s2;
		try {
			_s2 = in.nextLine();
		} catch (Exception e) {
			_s2 = null;
		}

		res = sortVersion(_s1, _s2);
		System.out.println(res);
		in.close();
	}

}
