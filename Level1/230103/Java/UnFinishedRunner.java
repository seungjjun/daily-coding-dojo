import java.util.Arrays;
import java.util.Stack;

public class UnFinishedRunner {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        Stack<String> participants = new Stack<>();
        Stack<String> completions = new Stack<>();

        for(String runner : participant) {
            participants.push(runner);
        }

        for(String finishedRunner : completion) {
            completions.push(finishedRunner);
        }

        for(int i = 0; i < completion.length; i += 1) {
            if(participants.peek().equals(completions.peek())) {
                completions.pop();
                participants.pop();
            }
        }

        return participants.peek();
    }
}
