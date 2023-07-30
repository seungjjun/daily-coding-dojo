import java.util.Stack;

public class Cache {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;

        Stack<String> database = new Stack<>();

        for (int i = 0; i < cities.length; i += 1) {
            cities[i] = cities[i].toLowerCase();
        }

        if (cacheSize == 0) {
            answer += cities.length * 5;
            return answer;
        }

        for (int i = 0; i < cities.length; i += 1) {
            if (!database.contains(cities[i])) {
                answer += 5;

                if (database.size() == cacheSize) {
                    database.remove(0);
                }

                database.push(cities[i]);
                continue;
            }

            if (database.contains(cities[i])) {
                answer += 1;

                database.remove(database.indexOf(cities[i]));

                if (database.size() == cacheSize) {
                    database.remove(0);
                }

                database.push(cities[i]);
            }
        }
        return answer;
    }
}
