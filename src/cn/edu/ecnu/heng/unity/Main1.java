package cn.edu.ecnu.heng.unity;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		scanner.close();
		if (line.indexOf("joker JOKER") != -1) {
			System.out.println("joker JOKER");
			return;
		}
		String index = "3 4 5 6 7 8 9 10 J Q K A 2 joker JOKER";
		String[] items = line.split("-");
		String[] A = items[0].split(" ");
		String[] B = items[1].split(" ");
		String flag = (A.length == 4 ? "1" : "0") + (B.length == 4 ? "1" : "0");
		switch (flag) {
		case "00":
			if(A.length == B.length) {
				if (index.indexOf(A[0]) > index.indexOf(B[0])) {
					System.out.println(items[0]);
				} else {
					System.out.println(items[1]);
				}
			}else {
				System.out.println("ERROR");
			}
			break;
		case "01":
			System.out.println(items[1]);
			break;
		case "10":
			System.out.println(items[0]);
			break;
		case "11":
			if (index.indexOf(A[0]) > index.indexOf(B[0])) {
				System.out.println(items[0]);
			} else {
				System.out.println(items[1]);
			}
			break;
		}
	}

}
