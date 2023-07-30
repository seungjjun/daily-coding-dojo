import java.util.Arrays;

public class MinimumNumber {
    public int solution(int[] A, int[] B) {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[A.length - i - 1];
        }

        return answer;
    }
}

/*
효율성 테스트 실패

        정렬
        solution 1

        Arrays.sort(A);

        Integer[] sortedB = Arrays.stream(B).boxed().toArray(Integer[]::new);
        Arrays.sort(sortedB, Collections.reverseOrder());

        for(int i = 0; i < A.length; i += 1) {
            int sum = A[i] * sortedB[i];

            answer += sum;
        }

        우선순위 큐 사용
        solution2

        PriorityQueue<Integer> aQueue = new PriorityQueue<>();
        PriorityQueue<Integer> bQueue = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < A.length; i += 1) {
           aQueue.offer(A[i]);
           bQueue.offer(B[i]);
        }

        while (!aQueue.isEmpty()) {
            answer += aQueue.poll() * bQueue.poll();
        }
 */