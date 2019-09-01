package cn.edu.ecnu.heng.unity;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] items = scanner.nextLine().split(" ");
		scanner.close();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < items[0].length(); i++) {
			char ch = items[0].charAt(i);
			int index = items[1].indexOf(ch, map.get(ch) == null ? 0 : map.get(ch));
			if (index == -1) {
				System.out.println("NO");
				return;
			}
			map.put(ch, index + 1);
		}
		System.out.println("YES");
	}

}
