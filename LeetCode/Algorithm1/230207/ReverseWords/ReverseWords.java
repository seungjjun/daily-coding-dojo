public class ReverseWords {
    public String reverseWords(String s) {
        char[] words = s.toCharArray();

        int start = 0;

        for(int end = 0; end <= words.length; end += 1) {
            if(end == words.length || words[end] == ' ') {
                reverse(words, start, end - 1);

                start = end + 1;
            }
        }

        return new String(words);
    }

    private void reverse(char[] words, int start, int end) {
        while (start < end) {
            char temp = words[start];
            words[start] = words[end];
            words[end] = temp;

            start += 1;
            end -= 1;
        }
    }
}

/*
효율성이 좋지 못한 풀이

public String reverseWords(String s) {
        String answer = "";
        String[] splited = s.split(" ");

        for (int i = 0; i < splited.length; i += 1) {
            int start = 0;
            int end = splited[i].length() - 1;

            String[] words = splited[i].split("");

            while (start < end) {
                String temp = words[start];
                words[start] = words[end];
                words[end] = temp;

                start += 1;
                end -= 1;
            }

            for (int j = 0; j < words.length; j += 1) {
                answer += words[j];
            }

            if (i < splited.length - 1) {
                answer += " ";
            }
        }

        return answer;
    }
 */