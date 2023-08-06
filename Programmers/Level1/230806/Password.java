package com.server.market.models.cart;

import java.util.HashSet;
import java.util.Set;

public class Password {
    public String solution(String s, String skip, int index) {
        String answer = "";
        Set<Integer> skipAscii = new HashSet<>();
        for (int i = 0; i < skip.length(); i += 1) {
            int ascii = skip.charAt(i);
            skipAscii.add(ascii);
        }

        for (int i = 0; i < s.length(); i += 1) {
            int ascii = s.charAt(i);
            for (int j = 1; j <= index; j += 1) {
                ascii += 1;
                if (ascii > 122) {
                    ascii -= 26;
                }

                while (skipAscii.contains(ascii)) {
                    ascii += 1;
                    if (ascii > 122) {
                        ascii -= 26;
                    }
                }
            }

            char convertedChar = (char) ascii;
            answer += convertedChar;
        }

        return answer;
    }
}
