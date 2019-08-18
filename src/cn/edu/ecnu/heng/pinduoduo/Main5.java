/**
 * 
 */
package cn.edu.ecnu.heng.pinduoduo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Heng(LEGION)
 *
 * @create 2019年7月28日-下午3:35:39
 *
 * @detail
 */
public class Main5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] AStr = scanner.nextLine().split(" ");
		String[] BStr = scanner.nextLine().split(" ");
		scanner.close();
		Integer[] A = new Integer[AStr.length];
		Integer[] B = new Integer[BStr.length];
		if (B.length == 0) {
			System.out.println("NO");
			return;
		}
		for (int i = 0; i < AStr.length; i++) {
			A[i] = Integer.parseInt(AStr[i]);
		}
		for (int i = 0; i < BStr.length; i++) {
			B[i] = Integer.parseInt(BStr[i]);
		}
		Arrays.sort(B);// 将B数组变成升序
		for (int i = 1; i < A.length; i++) {
			if (A[i - 1] > A[i]) {// 找到错误数字的索引号
				for (int j = B.length - 1; j > -1; j--) {
					if (i == A.length - 1) {
						if (B[j] > A[i - 1]) {
							A[i] = B[j];
							for (Integer a : A) {
								System.out.print(a + " ");
							}
							return;
						}
					} else {
						if (B[j] > A[i - 1] && B[j] < A[i + 1]) {
							A[i] = B[j];
							for (Integer a : A) {
								System.out.print(a + " ");
							}
							return;
						}
					}
				}
				System.out.println("NO");
				return;
			}
		}
		for (Integer a : A) {
			System.out.print(a + " ");
		}
	}
}
