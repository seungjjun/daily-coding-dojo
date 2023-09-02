package com.example.jwt;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ParcelBox {
    public int solution(int[] order) {
        int answer = 0;

        Queue<Integer> mainBelt = new LinkedList<>();
        Stack<Integer> assistantBelt = new Stack<>();

        for (int i = 1; i <= order.length; i += 1) {
            mainBelt.add(i);
        }

        int number = 0;
        while (number != order.length) {
            if (!assistantBelt.isEmpty()) {
                if (assistantBelt.peek() == order[number]) {
                    assistantBelt.pop();
                    answer += 1;
                    number += 1;
                    continue;
                }

                if (assistantBelt.peek() != order[number] && order[number] < mainBelt.peek()) {
                    return answer;
                }
            }

            if (order[number] != mainBelt.peek()) {
                assistantBelt.push(mainBelt.peek());
                mainBelt.poll();
                continue;
            }

            if (order[number] == mainBelt.peek()) {
                mainBelt.poll();
                answer += 1;
                number += 1;
            }

        }

        return answer;
    }
}
