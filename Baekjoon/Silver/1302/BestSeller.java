import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class BestSeller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        Map<String, Integer> bestseller = new HashMap<>();

        for (int i = 0; i < N; i += 1) {
            String book = scanner.next();
            bestseller.put(book, bestseller.getOrDefault(book, 0) + 1);
        }

        TreeMap<String, Integer> sortedMap = new TreeMap<>(bestseller);

        int largestValue = Integer.MIN_VALUE;
        String keyOfLargestValue = null;

        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            if (entry.getValue() > largestValue) {
                largestValue = entry.getValue();
                keyOfLargestValue = entry.getKey();
            }
        }

        System.out.println(keyOfLargestValue);
    }
}
