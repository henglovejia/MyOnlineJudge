package cn.edu.ecnu.heng.bytedance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main3 {
	public static class Score implements Comparable<Score> {
		Integer score, place;

		public Score(Integer score, Integer place) {
			this.score = score;
			this.place = place;
		}

		@Override
		public int compareTo(Score score) {
			if (score.score == this.score) {
				return this.place - score.place;
			} else {
				return this.score - score.score;
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		for (int i = 0; i < num; i++) {
			int n = scanner.nextInt();
			ArrayList<Score> scores = new ArrayList<>(n);
			HashMap<Integer, Integer> place_score = new HashMap<>(n);
//			HashMap<Integer, Integer> score_place = new HashMap<>(n);
			HashMap<Integer, Integer> score_num = new HashMap<>(n);
//			int minScore = Integer.MAX_VALUE;
//			int minPlace = 0;
			for (int j = 0; j < n; j++) {
				int score = scanner.nextInt();
				place_score.put(j, score);
				scores.add(new Score(score, j));
			}
			Collections.sort(scores);
			score_num.put(scores.get(0).place, 1);
			for (int j = 1; j < n; j++) {
				int tmp = scores.get(j).place;
				int before = (tmp - 1 + n) % n;
				int after = (tmp + 1) % n;
				int before_score = place_score.get(before);
//				int after_score = place_score.get(after);
				if (score_num.containsKey(before) && before_score < scores.get(j).score) {
					score_num.put(tmp, score_num.get(before) + 1);
				}
				if(score_num.containsKey(after) && before_score < scores.get(j).score) {
					if(score_num.containsKey(tmp)) {
						
					}
				}
			}
		}
		scanner.close();
	}

}
