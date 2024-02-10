import java.util.*;

public class DestinationCity {
        public String destCity(List<List<String>> paths) {
            Map<String, Integer> end = new HashMap<>();

            for (List<String> strings : paths) {
                end.put(strings.get(0), end.getOrDefault(strings.get(0), 0) + 1);
            }

            for (List<String> path : paths) {
                if (!end.containsKey(path.get(1))) {
                    return path.get(1);
                }
            }

            return "";
        }
}
