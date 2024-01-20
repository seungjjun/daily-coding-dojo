package com.beside.wotd;

import java.util.LinkedList;
import java.util.Queue;

public class ConvertWord {
    public static class State {
        private final String word;
        private final int step;

        public State(String word, int step) {
            this.word = word;
            this.step = step;
        }
    }

    public int solution(String begin, String target, String[] words) {
        int answer = 0;

        boolean[] isVisited = new boolean[words.length];
        Queue<State> queue = new LinkedList<>();
        queue.offer(new State(begin, 0));

        while (!queue.isEmpty()) {
            State state = queue.poll();

            if (state.word.equals(target)) {
                return state.step;
            }

            for (int i = 0; i < words.length; i += 1) {
                String next = words[i];
                if (isVisited[i]) {
                    continue;
                }

                if (!isConvertable(state.word, next)) {
                    continue;
                }

                isVisited[i] = true;
                queue.offer(new State(next, state.step + 1));
            }
        }

        return answer;
    }

    private boolean isConvertable(String currentWord, String nextWord) {
        char[] currentArray = currentWord.toCharArray();
        char[] nextArray = nextWord.toCharArray();

        int diff = 0;
        for (int i = 0; i < currentArray.length; i += 1) {
            if (currentArray[i] != nextArray[i]) {
                diff += 1;
            }
        }

        return diff == 1;
    }
}
