import java.util.HashSet;
import java.util.Iterator;

public class FindPrimeNumber {
    HashSet<Integer> hashSet = new HashSet<>();

    public int solution(String numbers) {
        int answer = 0;

        recursive("", numbers);

        Iterator<Integer> iterator = hashSet.iterator();

        while (iterator.hasNext()) {
            if(isPrime(iterator.next())) {
                answer += 1;
            }
        }

        return answer;
    }

    private void recursive(String combination, String numbers) {
        if(!combination.equals("")) {
            hashSet.add(Integer.parseInt(combination));
        }

        for(int i = 0; i < numbers.length(); i += 1) {
            recursive(combination + numbers.charAt(i),
                numbers.substring(0, i) + numbers.substring(i + 1));
        }
    }

    private boolean isPrime(int number) {
        if(number == 0 || number == 1) {
            return false;
        }

        int size = (int) Math.sqrt(number);

        for(int i = 2; i <= size; i += 1) {
            if(number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
