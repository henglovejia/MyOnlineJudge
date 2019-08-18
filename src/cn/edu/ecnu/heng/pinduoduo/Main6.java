/**
 * 
 */
package cn.edu.ecnu.heng.pinduoduo;

import java.util.Scanner;

/**
 * @author Heng(LEGION)
 *
 * @create 2019年7月28日-下午4:06:51
 *
 * @detail
 */
public class Main6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		scanner.close();
		int[] nums = new int[26];
		int y = 0;
		for (int i = 0; i < line.length(); i++) {// 求出所有字母出現的次数
			if (line.charAt(i) != ' ') {
				nums[line.charAt(i) - 'A']++;
			}
		}
		for (int num : nums) {// 统计出现次数为奇数的个数
			if (num % 2 == 1) {
				y++;
			}
		}
		if (y % 2 == 1) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}
