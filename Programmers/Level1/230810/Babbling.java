package com.aiceltech.mi.api.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Babbling {
    public int solution(String[] babbling) {
        int answer = 0;
        Set<String> set = new HashSet<>(List.of("aya", "ye", "woo", "ma"));

        for (String word : babbling) {
            String[] words = word.split("");

            String currentBabbling = "";
            String beforeBabbling = "";
            for (int i = 0; i < words.length; i += 1) {
                currentBabbling += words[i];

                if (currentBabbling.length() == 2 && set.contains(currentBabbling) && !currentBabbling.equals(beforeBabbling)) {
                    beforeBabbling = currentBabbling;
                    currentBabbling = "";
                }

                if (currentBabbling.length() == 3 && set.contains(currentBabbling) && !currentBabbling.equals(beforeBabbling)) {
                    beforeBabbling = currentBabbling;
                    currentBabbling = "";
                }

                if (currentBabbling.length() == 4) {
                    break;
                }

                if (currentBabbling.equals("") && i == words.length - 1) {
                    answer += 1;
                }
            }
        }

        return answer;
    }
}
