public class SplitString {
    public int solution(String s) {
        int answer = 0;

        String[] splitString = s.split("");

        int xCount = 0;
        int otherCount = 0;
        String x = "";

        for (int i = 0; i < splitString.length; i += 1) {
            if (xCount == 0) {
                x = splitString[i];
            }
            if (x.equals(splitString[i])) {
                xCount += 1;
            }

            if (!x.equals(splitString[i])) {
                otherCount += 1;
            }

            if (xCount == otherCount) {
                answer += 1;
                xCount = 0;
                otherCount = 0;
                continue;
            }

            if (i == splitString.length - 1) {
                answer += 1;
            }
        }

        return answer;
    }
}
