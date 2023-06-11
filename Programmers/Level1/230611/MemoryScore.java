import java.util.HashMap;

public class MemoryScore {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        HashMap<String, Integer> scoreMap = new HashMap<>();

        for (int i = 0; i < name.length; i += 1) {
            scoreMap.put(name[i], yearning[i]);
        }

        for (int i = 0; i < photo.length; i += 1) {
            int score = 0;
            for (int j = 0; j < photo[i].length; j += 1) {
                if (scoreMap.containsKey(photo[i][j])) {
                    score += scoreMap.get(photo[i][j]);
                }
            }
            answer[i] = score;
        }

        return answer;
    }
}
