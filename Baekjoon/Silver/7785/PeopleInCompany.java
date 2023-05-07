import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> people = new HashMap();

        int n = scanner.nextInt();

        for (int i = 0; i < n; i += 1) {
            String name = scanner.next();
            String log = scanner.next();
            if (Objects.equals(log, "enter")) {
                people.put(name, name);
            }

            if (Objects.equals(log, "leave")) {
                people.remove(name);
            }
        }

        List<String> list = new ArrayList<>(people.values());
        list.sort(Comparator.reverseOrder());

        for (String person : list) {
            System.out.println(person);
        }
    }
}
