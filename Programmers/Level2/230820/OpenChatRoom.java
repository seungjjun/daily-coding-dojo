package com.example.demo.security;

import java.util.HashMap;
import java.util.Map;

public class OpenChatRoom {
    public String[] solution(String[] records) {
        Map<String, String> userRecord = new HashMap<>();

        int size = 0;
        for (String record : records) {
            String[] action = record.split(" ");

            if (action[0].equals("Enter")) {
                size += 1;
                userRecord.put(action[1], action[2]);
                continue;
            }

            if (action[0].equals("Leave")) {
                size += 1;
                continue;
            }

            if (action[0].equals("Change")) {
                userRecord.put(action[1], action[2]);
            }
        }

        String[] answer = new String[size];
        int index = 0;

        for (String record : records) {
            String result = "";
            String[] action = record.split(" ");

            if (action[0].equals("Change")) {
                continue;
            }

            if (action[0].equals("Enter")) {
                result = userRecord.get(action[1]) + "님이 들어왔습니다.";
            }

            if (action[0].equals("Leave")) {
                result = userRecord.get(action[1]) + "님이 나갔습니다.";
            }

            answer[index] = result;
            index += 1;
        }

        return answer;
    }
}
