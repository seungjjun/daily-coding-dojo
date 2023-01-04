import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        Map<String, Integer> hashMap = new HashMap<>();

        for(String phoneNumber : phone_book) {
            hashMap.put(phoneNumber, 0);
        }

        for(int i = 0; i < hashMap.size(); i += 1) {
            for(int j = 0; j < phone_book[i].length(); j += 1) {
                if(hashMap.containsKey(phone_book[i].substring(0, j))) {
                    return false;
                }
            }
        }

        return answer;
    }
}

/*
해시맵을 사용하지 않은 풀이

    import java.util.Arrays;

    boolean answer = true;

    Arrays.sort(phone_book);

    for (int i = 0; i < phone_book.length - 1; i += 1) {
        if (phone_book[i + 1].startsWith(phone_book[i])) {
            return false;
        }
    }

    return answer;
*/