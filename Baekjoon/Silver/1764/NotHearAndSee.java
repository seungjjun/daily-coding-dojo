import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer = 0;

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        Map<String, Integer> notHearing = new HashMap<>();
        Map<String, Integer> notSeeing = new HashMap<>();
        List<String> notHearingAndSeeing = new ArrayList<>();

        for (int i = 0; i < N; i += 1) {
            notHearing.put(scanner.next(), 1);
        }

        for (int i = 0; i < M; i += 1) {
            notSeeing.put(scanner.next(), 1);
        }

        for (String person : notHearing.keySet()) {
            if (notSeeing.containsKey(person)) {
                notHearingAndSeeing.add(person);
                answer += 1;
            }
        }

        notHearingAndSeeing.sort(String::compareTo);
        System.out.println(answer);
        for (String person : notHearingAndSeeing) {
            System.out.println(person);
        }
    }
}
