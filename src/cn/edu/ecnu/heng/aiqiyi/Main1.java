package cn.edu.ecnu.heng.aiqiyi;

import java.math.BigInteger;
import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] tiji = new int[3];
		int[] qiege = new int[3];
		tiji[0] = scanner.nextInt() - 1;
		tiji[1] = scanner.nextInt() - 1;
		tiji[2] = scanner.nextInt() - 1;
		int k = scanner.nextInt();
		scanner.close();
		for (; k > 0;) {
			if (tiji[0] == 0 && tiji[1] == 0 && tiji[2] == 0) {
				break;
			}
			for (int i = 0; i < 3; i++) {
				if (tiji[i] > 0) {
					tiji[i]--;
					qiege[i]++;
					k--;
				}
			}
		}
		BigInteger sum = new BigInteger("1");
		for (int i = 0; i < 3; i++) {
			BigInteger tmp = new BigInteger((qiege[i] + 1) + "");
			sum = sum.multiply(tmp);
		}
		System.out.println(sum);
	}

}
