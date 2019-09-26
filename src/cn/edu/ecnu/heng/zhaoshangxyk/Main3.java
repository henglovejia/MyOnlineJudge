package cn.edu.ecnu.heng.zhaoshangxyk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3 {

	public static boolean ok(String S1, String S2, List<Integer> list) {
		int start = S2.length() - S1.length();
		for (int index : list) {
			if(index < start) {
				return false;
			}
			if (S1.charAt(index - start) != S2.charAt(index)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String number = scanner.nextLine();
		scanner.close();
		List<Integer> list = new ArrayList<Integer>(number.length());
		long count = 0;
		long mod = (long) Math.pow(10, 9) + 7;
		long max = Long.parseLong(number.replace("?", "9"));
		long min = Long.parseLong(number.replace("?", "0"));
		for (int i = 0; i < number.length(); i++) {
			if (number.charAt(i) != '?') {
				list.add(i);
			}
		}
		long i = (min / 13 - 1) * 13 + 5;
		i = i > 0 ? i : 5;
		for (; i <= max; i += 13) {
			if (ok(i + "", number, list)) {
				count++;
				if (count == mod) {
					count = 0;
				}
			}
		}
		System.out.println(count);
	}

}
