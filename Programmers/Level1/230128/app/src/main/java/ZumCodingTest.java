import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class ZumCodingTest {
//    public long solution1(long n) {
//        long answer = 0;
//
//        for(int i = 0; i < n * n; i += 1) {
//            if(i / n == i % n) {
//                answer += i;
//            }
//        }
//
//        return answer;
//    }

//    public int solution2(int[] histogram) {
//        int answer = -1;
//
//        Stack<Integer> stack = new Stack<>();
//
//        int histogramSize = histogram.length;
//
//        for (int i = 0; i < histogramSize; i += 1) {
//            while (!stack.isEmpty() && histogram[stack.peek()] > histogram[i]) {
//                int height = histogram[stack.pop()];
//                int width = i;
//
//                if (!stack.isEmpty()) {
//                    width = i - stack.peek() - 1;
//                }
//
//                if (answer < width * height) {
//                    answer = width * height;
//                }
//            }
//            stack.push(i);
//        }
//
//        while (!stack.isEmpty()) {
//            int height = histogram[stack.pop()];
//            int width = histogramSize;
//
//            if (!stack.isEmpty()) {
//                width = histogramSize - stack.peek() - 1;
//            }
//
//            if (answer < width * height) {
//                answer = width * height;
//            }
//        }
//
//        return answer;
//    }

    public int[] solution3(int[][] data) {
        int[] answer = new int[data.length];
        int cumulativeTime = 0;
        int currentTime = 0;

        Queue<int[]> printerQueue = new LinkedList<>();

        PriorityQueue<int[]> waitingDocuments = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[2] == o2[2]) {
                    return o1[1] - o2[1];
                }
                return o1[2] - o2[2];
            }
        });

        for (int i = 0; i < data.length; i += 1) {
            currentTime = data[i][1];

            if (currentTime >= cumulativeTime) {
                while (!waitingDocuments.isEmpty()) {
                    printerQueue.offer(waitingDocuments.poll());
                }

                printerQueue.offer(data[i]);
                cumulativeTime = cumulativeTime + data[i][2];

            } else {
                waitingDocuments.offer(data[i]);
            }
        }

        while (!waitingDocuments.isEmpty()) {
            printerQueue.offer(waitingDocuments.poll());
        }

        int index = 0;

        while (!printerQueue.isEmpty()) {
            answer[index] = printerQueue.poll()[0];
            index += 1;
        }

        return answer;
    }
}

/*
public int[] solution(int[][] data) {
        int[] answer = {};

        PriorityQueue<Integer> printer = new PriorityQueue<>();

        int time = 0;

        for (int i = 0; i < data.length; i += 1) {
            printer.offer(data[i][0]);
        }

        while (!printer.isEmpty()) {
            for(int i = 0; i < data.length; i += 1) {

            }
        }

        return answer;
    }
 */

/*
public int solution3(int[] histogram) {
        int answer = -1;

        Stack<Integer> stack = new Stack<>();

        int histogramSize = histogram.length;

        for (int i = 0; i < histogramSize; i += 1) {
            while (!stack.isEmpty() && histogram[stack.peek()] > histogram[i]) {
                int height = histogram[stack.pop()];
                int width = i;

                if (!stack.isEmpty()) {
                    width = i - stack.peek() - 1;
                }

                if (answer < width * height) {
                    answer = width * height;
                }
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            int height = histogram[stack.pop()];
            int width = histogramSize;

            if (!stack.isEmpty()) {
                width = histogramSize - stack.peek() - 1;
            }

            if (answer < width * height) {
                answer = width * height;
            }
        }

        return answer;
    }
 */

/*
public int[] solution(int[][] data) {
        int[] answer = new int[data.length];
        int cumulativeTime = 0;
        int currentTime = 0;

        Queue<int[]> result = new LinkedList<>();

        PriorityQueue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[2] == o2[2]) return o1[1] - o2[1];
                return o1[2] - o2[2];
            }
        });

        for (int i = 0; i < data.length; i += 1) {
            currentTime = data[i][1];

            if (currentTime >= cumulativeTime) {
                while (!queue.isEmpty()) {
                    result.add(queue.poll());
                }
                result.add(data[i]);
                cumulativeTime = cumulativeTime + data[i][2];

            } else {
                queue.add(data[i]);
            }
        }

        while (!queue.isEmpty()) {
            result.add(queue.poll());
        }

        int i = 0;

        while (!result.isEmpty()) {
            answer[i] = result.poll()[0];
            i += 1;
        }

        return answer;
    }
 */