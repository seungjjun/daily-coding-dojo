import java.util.HashMap;
import java.util.Map;

public class RunningRace {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < players.length; i += 1) {
            hashMap.put(players[i], i);
        }

        for (String calling : callings) {
            int index = hashMap.get(calling);
            String key = players[index - 1];

            hashMap.put(key, hashMap.get(key) + 1);
            hashMap.put(calling, hashMap.get(calling) - 1);

            players[index - 1] = calling;
            players[index] = key;
        }

        return players;
    }
}
