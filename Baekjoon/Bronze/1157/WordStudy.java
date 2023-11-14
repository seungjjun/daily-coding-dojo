import java.util.*;
import java.util.stream.Collectors;

public class WordStudy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next().toUpperCase();

        Map<Character, Integer> alphabets = new HashMap<>();
        for (char alphabet : word.toCharArray()) {
            alphabets.put(alphabet, alphabets.getOrDefault(alphabet, 0) + 1);
        }

        Integer maxValue = Collections.max(alphabets.values());

        List<Map.Entry<Character, Integer>> list = alphabets.entrySet().stream()
                .filter(map -> map.getValue().equals(maxValue))
                .collect(Collectors.toList());

        if (list.size() > 1) {
            System.out.println("?");
        } else {
            System.out.println(list.get(0).getKey());
        }
    }
}
