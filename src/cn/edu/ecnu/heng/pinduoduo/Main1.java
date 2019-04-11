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
 * @create 2019年3月10日-下午4:13:08
 *
 * @detail
 */
public class Main1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner in = new Scanner(System.in);
			int length = in.nextInt();
			List<Integer> a = new ArrayList<>(length);
			List<Integer> b = new ArrayList<>(length);
			for (int i = 0; i < length; i++) {
				a.add(in.nextInt());
			}
			for (int i = 0; i < length; i++) {
				b.add(in.nextInt());
			}
			Collections.sort(a);
			Collections.sort(b);
			int sum = 0;
			for (int i = 0; i < length; i++) {
				sum += a.get(length - i - 1) * b.get(i);
			}
			System.out.println(sum);
			in.close();
	}

}
