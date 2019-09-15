package cn.edu.ecnu.heng.xiecheng;

import java.util.*;

public class Main1 {

	static int longestSubStrLength(String s1, String s2) {
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		if (s1.length() > s2.length()) {
			String tmp = s1;
			s1 = s2;
			s2 = tmp;
		}
		for (int i = s1.length(); i > -1; i--) {
			for (int j = 0; j + i <= s1.length(); j++) {
				String tmp = s1.substring(j, j + i);
				if (s2.indexOf(tmp) != -1) {
					return i;
				}
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int res;

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

		res = longestSubStrLength(_s1, _s2);
		System.out.println(String.valueOf(res));
		in.close();
	}

}
