public class DartGame {
    public int solution(String dartResult) {
        int answer = 0;

        int[] dartScore = new int[3];

        int scoreIndex = 0;

        for(int i = 0; i < dartResult.length(); i += 1) {
            char resultsByDartGame = dartResult.charAt(i);

            if(Character.isDigit(resultsByDartGame)) {
                if(resultsByDartGame == '1' && dartResult.charAt(i + 1) == '0') {
                    dartScore[scoreIndex] = 10;
                    i += 1;
                    continue;
                }

                dartScore[scoreIndex] = resultsByDartGame - '0';
            }

            if(!Character.isDigit(resultsByDartGame)) {
                if(dartResult.charAt(i) == 'D') {
                    dartScore[scoreIndex] = (int) Math.pow(dartScore[scoreIndex], 2);
                }

                if(dartResult.charAt(i) == 'T') {
                    dartScore[scoreIndex] = (int) Math.pow(dartScore[scoreIndex], 3);
                }

                if(dartResult.charAt(i) == '#') {
                    dartScore[scoreIndex] *= -1 ;
                }

                if(dartResult.charAt(i) == '*' && i != 2) {
                    dartScore[scoreIndex - 1] *= 2;
                    dartScore[scoreIndex] *= 2;
                }

                if(dartResult.charAt(i) == '*' && i == 2) {
                    dartScore[scoreIndex] *= 2;
                }

                if(i != dartResult.length() - 1 && Character.isDigit(dartResult.charAt(i + 1))) {
                    scoreIndex += 1;
                }
            }
        }

        for(int score : dartScore) {
            answer += score;
        }

        return answer;
    }
}
