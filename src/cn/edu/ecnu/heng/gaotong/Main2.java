package cn.edu.ecnu.heng.gaotong;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine().replace("\"", "");
		scanner.close();
		int index = line.indexOf("%22");
		if (index == 0) {
			line = line.substring(3, line.length());
		}
		index = line.indexOf("<");
		line = line.substring(0, index);
		if (line.substring(line.length() - 3, line.length()).equals("%22")) {
			line = line.substring(0, line.length() - 3);
		}
		System.out.println(line);
	}

}
