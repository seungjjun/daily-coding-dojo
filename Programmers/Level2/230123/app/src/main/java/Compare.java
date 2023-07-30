import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Compare {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        Stack<Integer> attackPowerStack = new Stack<>();

        for (int i = 1; i <= number; i += 1) {
            int divisorNumber = getDivisorNumber(i);

            attackPowerStack.push(divisorNumber);
        }

        int size = attackPowerStack.size();

        for (int i = 1; i <= size; i += 1) {
            if(attackPowerStack.peek() > limit) {
                attackPowerStack.pop();
                answer += power;
                continue;
            }

            answer += attackPowerStack.pop();
        }

        return answer;
    }

    public int getDivisorNumber(int number) {
        int divisorNumber = 0;

        for (int i = 1; i * i <= number; i += 1) {
            if (number % i == 0) {
                if(Math.pow(i, 2) == number) {
                    divisorNumber += 1;
                    continue;
                }

                divisorNumber += 2;
            }
        }

        return divisorNumber;
    }
}

/*
시간 초과로 실패

public int solution(int number, int limit, int power) {
        int answer = 0;

        List<Integer> attackPower = new ArrayList<>();
        List<Integer> newAttackPower = new ArrayList<>();

        for (int i = 1; i <= number; i += 1) {
            int divisorNumber = getDivisorNumber(i);

            attackPower.add(divisorNumber);
        }

        for (int i = 0; i < attackPower.size(); i += 1) {
            if (attackPower.get(i) > limit) {
                newAttackPower.add(power);
                continue;
            }

            newAttackPower.add(attackPower.get(i));
        }

        for (Integer newPower : newAttackPower) {
            answer += newPower;
        }

        return answer;
    }

    public int getDivisorNumber(int number) {
        int divisorNumber = 0;

        for (int j = 1; j <= number; j += 1) {
            if (number % j == 0) {
                divisorNumber += 1;
            }
        }

        return divisorNumber;
    }
 */