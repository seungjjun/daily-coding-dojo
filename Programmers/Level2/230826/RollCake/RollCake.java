package com.example.demo;

import java.util.*;

public class RollCake {
    public int solution(int[] topping) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        for (int toppingNumber : topping) {
            map.put(toppingNumber, map.getOrDefault(toppingNumber, 0) + 1);
        }

        for (int toppingNumber : topping) {
            set.add(toppingNumber);
            map.replace(toppingNumber, map.get(toppingNumber) - 1);

            if (map.get(toppingNumber) == 0) {
                map.remove(toppingNumber);
            }

            if (set.size() == map.keySet().size()) {
                answer += 1;
            }
        }

        return answer;
    }
}
