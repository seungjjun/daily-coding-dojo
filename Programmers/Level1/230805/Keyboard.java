package com.server.market.models.cart;

import java.util.HashMap;
import java.util.Map;

public class Keyboard {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        Map<String, Integer> keySequence = new HashMap<>();

        for (int i = 0; i < keymap.length; i += 1) {
            String[] keys = keymap[i].split("");

            for (int j = 0; j < keys.length; j += 1) {
                if (keySequence.getOrDefault(keys[j], 101) > j + 1) {
                    keySequence.put(keys[j], j + 1);
                }
            }
        }

        for (int i = 0; i < targets.length; i += 1) {
            String[] targetArray = targets[i].split("");
            int sum = 0;

            for (int j = 0; j < targetArray.length; j += 1) {
                String target = targetArray[j];
                if (keySequence.getOrDefault(target, -1) == -1) {
                    sum = -1;
                    break;
                }
                sum += keySequence.getOrDefault(target, -1);
            }

            answer[i] = sum;
        }

        return answer;
    }
}

/*
public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        for (int i = 0; i < targets.length; i += 1) {
            int sum = 0;
            String[] targetArray = targets[i].split("");

            for (int j = 0; j < targetArray.length; j += 1) {
                String target = targetArray[j];

                int[] temps = new int[keymap.length];
                for (int k = 0; k < keymap.length; k += 1) {
                    if (!keymap[k].contains(target)) {
                        temps[k] = 101;
                    } else {
                        temps[k] = keymap[k].indexOf(target) + 1;
                    }
                }

                Arrays.sort(temps);
                if (temps[0] == 101) {
                    sum += -1;
                } else {
                    sum += temps[0];
                }
            }

            answer[i] = sum;
        }

        return answer;
    }
 */
