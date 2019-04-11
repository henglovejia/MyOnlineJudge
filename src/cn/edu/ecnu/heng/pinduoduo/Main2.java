/**
 * 
 */
package cn.edu.ecnu.heng.pinduoduo;

import java.util.Scanner;

/**
 * @author Heng(LEGION)
 *
 * @create 2019年3月10日-下午4:13:13
 *
 * @detail
 */
public class Main2 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String word = in.next().toLowerCase();
		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower= upper.toLowerCase();
		in.close();
		for (int i = 0; i < upper.length(); i++) {
			if(word.indexOf(lower.charAt(i))!=-1) {
				System.out.println(lower.charAt(i));
				return;
			}
		}
	}
}
