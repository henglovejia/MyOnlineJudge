package cn.edu.ecnu.heng.zhaoshangxyk;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] datas = scanner.nextLine().split(" ");
		scanner.close();
		SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		try {
			long now = sDateFormat.parse(datas[0] + "-" + datas[1] + "-" + datas[2]).getTime();
			long old = sDateFormat.parse(datas[0] + "-1-1").getTime();
			long time = now - old;
			System.out.println(time / 1000 / 60 / 60 / 24 + 1);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
