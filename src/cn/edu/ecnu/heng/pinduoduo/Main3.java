/**
 * 
 */
package cn.edu.ecnu.heng.pinduoduo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author Heng(LEGION)
 *
 * @create 2019年3月10日-下午4:13:20
 *
 * @detail
 */
public class Main3 {
	public static class Bank implements Comparable<Bank> {
		Integer a, b;

		public Bank(Integer a, Integer b) {
			this.a = a;
			this.b = b;
		}

		@Override
		public int compareTo(Bank bank) {
			if (bank.b == this.b) {
				return bank.a - this.a;
			} else {
				return bank.b - this.b;
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int d = in.nextInt() - 1;
		if (n == 1) {
			System.out.println(0);
		}
		List<Bank> banks = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			banks.add(new Bank(in.nextInt(), in.nextInt()));
		}
		in.close();
		Collections.sort(banks);
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (Math.abs(banks.get(i).a - banks.get(j).a) > d) {
					System.out.println(banks.get(i).b + banks.get(j).b);
					return;
				}
			}
		}
	}

}
