public class NumberOfCountry {
    public String solution(int n) {
        String answer = "";

        while (n > 3) {
            switch (n % 3) {
                case 1 -> answer = "1" + answer;
                case 2 -> answer = "2" + answer;
                default -> {
                    answer = "4" + answer;
                    n = n / 3 - 1;
                    continue;
                }
            }

            n = n / 3;
        }

        answer = switch (n) {
            case 1 -> "1" + answer;
            case 2 -> "2" + answer;
            default -> "4" + answer;
        };

        return answer;
    }
}
