public class TargetNumber {
    private int[] numbers;
    private int target;
    private int answer;

    public int solution(int[] numbers, int target) {
        answer = 0;
        this.numbers = numbers;
        this.target = target;

        dfs(0, 0);

        return answer;
    }

    private void dfs(int index, int sum) {
        if (index == numbers.length) {
            if (target == sum) {
                answer += 1;
            }
            return;
        }

        dfs(index + 1, sum + numbers[index]);
        dfs(index + 1, sum - numbers[index]);
    }
}
