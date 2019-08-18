package cn.edu.ecnu.heng.tencent.two;

import java.util.Scanner;

public class Main1 {

	public static class NestedData implements Comparable<NestedData> {

		public NestedData() {

		}

		@Override
		public int compareTo(NestedData data) {
			return 0;
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		scanner.close();
		for (int i = 0; i < line.length(); i++) {
			if (line.charAt(i) == ']') {
				int end = i;
				for (int j = i - 1; j > -1; j--) {
					if (line.charAt(j) == '|') {
						int middle = j;
						for (int k = j - 1; k > -1; k--) {
							if (line.charAt(k) == '[') {
								int start = k;
								int times = Integer.parseInt(line.substring(start+1, middle));
								StringBuilder sBuilder = new StringBuilder();
								String tmp = line.substring(middle+1, end);
								for (int n = 0; n < times; n++) {
									sBuilder.append(tmp);
								}
								line = line.substring(0, start) + sBuilder.toString() + line.substring(end+1);
								i = -1;
								break;
							}
						}
						break;
					}
				}
			}
		}
		System.out.println(line);
	}

}
