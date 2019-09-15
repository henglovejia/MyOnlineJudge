package cn.edu.ecnu.heng.aiqiyi;

import java.util.*;

public class Main3 {
	public static void function1(long[] count, List<Integer> list, int[] num, String[] split) {
		if (list.size() == num.length) {
			int flag1 = 1;
			for (int j = 0; j < list.size() - 1; j++) {
				if (split[j].equals("1") && list.get(j) > list.get(j + 1)) {
					continue;
				} else if (split[j].equals("0") && list.get(j) < list.get(j + 1)) {
					continue;
				} else {
					flag1 = 0;
				}
			}
			count[0] += flag1;
		} else {
			for (int i = 0; i < num.length; i++) {
				if (list.contains(num[i]))
					continue;
				list.add(num[i]);
				function1(count, list, num, split);
				list.remove(list.size() - 1);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.valueOf(sc.nextLine());
		String string = sc.nextLine();
		sc.close();
		String[] split = string.split(" ");
		int num[] = new int[N];
		for (int i = 0; i < N; i++) {
			num[i] = i + 1;
		}
		List<Integer> templist = new ArrayList<Integer>();
		long[] count = new long[1];
		count[0] = 0;
		function1(count, templist, num, split);
		System.out.println(count[0] % (1000000007));
	}
}