import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class NumberCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Map<Integer, Integer> cards = new HashMap<>();
        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 0; i < N; i += 1) {
            int card = scanner.nextInt();
            cards.put(card, cards.getOrDefault(card, 0) + 1);
        }

        int M = scanner.nextInt();
        List<Integer> gettingCards = new ArrayList<>();

        for (int i = 0; i < M; i += 1) {
            gettingCards.add(scanner.nextInt());
        }

        for (int cardNumber : gettingCards) {
            if (cards.containsKey(cardNumber)) {
                stringBuffer.append(cards.get(cardNumber) + " ");
            }

            if (!cards.containsKey(cardNumber)) {
                stringBuffer.append(0 + " ");
            }
        }

        System.out.println(stringBuffer);
    }
}
