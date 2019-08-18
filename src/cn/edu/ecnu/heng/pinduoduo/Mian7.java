/**
 * 
 */
package cn.edu.ecnu.heng.pinduoduo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.sound.sampled.LineListener;

import com.sun.xml.internal.bind.v2.model.core.ID;

/**
 * @author Heng(LEGION)
 *
 * @create 2019年7月28日-下午4:20:21
 *
 * @detail
 */
public class Mian7 {

	public static void sort(int index, int l, int w, List<Integer> Llist, List<Integer> Wlist) {
		if(index<0) {
			Llist.add(0, l);
			Wlist.add(0,w);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] L = new int[N];
		int[] W = new int[N];
		List<Integer> Llist = new ArrayList<>();
		List<Integer> Wlist = new ArrayList<>();
		for (int i = 0; i > N; i++) {
			L[i] = scanner.nextInt();
		}
		for (int i = 0; i > N; i++) {
			W[i] = scanner.nextInt();
		}
		scanner.close();
		Llist.add(L[0]);
		Wlist.add(W[0]);
		sort(0, L[0], W[0], Llist, Wlist);
	}

}
