public class FruitBox {
    public int solution(int k, int m, int[] score) {
        // k를 이용한 풀이

        int answer = 0;

        int[] fruitBox = new int[m];

        int index = 0;

        while (k > 0) {
            for(int i = 0; i < score.length; i += 1) {
                if(score[i] == k) {
                    fruitBox[index] = score[i];
                    index += 1;
                }

                if(fruitBox[m - 1] != 0) {
                    answer += k * m;

                    fruitBox = new int[m];

                    index = 0;
                }
            }

            k -= 1;
        }

        return answer;
    }
}

/*
시간 초과

public int solution(int k, int m, int[] score) {
        int answer = 0;

        List<Integer> fruits = new ArrayList<>();

        for(int i = 0; i < score.length; i += 1) {
            fruits.add(score[i]);
        }

        fruits.sort(Collections.reverseOrder());

        while (fruits.size() >= m) {
            for(int i = 0; i < m; i += 1) {
                if(i == m - 1) {
                    answer += fruits.get(0) * m;
                }

                fruits.remove(0);
            }
        }

        return answer;
    }

 */

/*
다른 간단한 풀이
        int answer = 0;

        Arrays.sort(score);

        for(int i = score.length; i >= m; i -= m){
            answer += score[i - m] * m;
        }

        return answer;
 */