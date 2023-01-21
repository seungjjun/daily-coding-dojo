import java.util.Arrays;

public class LandGame {
    int solution(int[][] land) {
        int[] score = land[land.length - 1];

        for (int i = 1; i < land.length; i += 1) {
            land[i][0] += Math.max(Math.max(land[i - 1][1], land[i - 1][2]), land[i - 1][3]);
            land[i][1] += Math.max(Math.max(land[i - 1][0], land[i - 1][2]), land[i - 1][3]);
            land[i][2] += Math.max(Math.max(land[i - 1][0], land[i - 1][1]), land[i - 1][3]);
            land[i][3] += Math.max(Math.max(land[i - 1][0], land[i - 1][1]), land[i - 1][2]);
        }

        Arrays.sort(score);

        return score[score.length - 1];
    }
}

// 막힌 풀이
//    public int solution(int[][] land) {
//        int answer = 0;
//
//        int previousLand = 0;
//        int secondScore = 0;
//
//        int[] landScore = new int[land.length];
//
//        for(int i = 0; i < land.length; i += 1) {
//            for(int j = 0; j < 4; j += 1) {
//                if(landScore[i] < land[i][j]) {
//                    secondScore = landScore[i];
//
//                    landScore[i] = land[i][j];
//                }
//
//                if(landScore[i] <= land[i][j] && previousLand == 0) {
//                    previousLand = j;
//                }
//
//                if(i > 0 && previousLand == j && landScore[i] < land[i][j]) {
//                    landScore[i] = secondScore;
//                    previousLand = 0;
//                }
//            }
//        }
//
//        for(int score : landScore) {
//            answer += score;
//        }
//
//        return answer;
//    }