# 문제
주어진 자연수를 연속된 자연수들로 표현하는 방법의 수를 구하는 문제 (ex. 1 + 2 + 3 + 4 + 5 = 15)

1. 이해
- 연속된 자연수들로 표현해야 한다. (ex. 1 + 2 + 3)
- 자기 자신도 표현의 방법이 된다.
- 이중 반복문을 사용하지 않고 어떻게 연속된 자연수를 표현할 수 있을까?

2. 계획
- 1부터 주어진 수 까지 배열에 하나씩 담는다.
- 첫번째 배열 값 부터 1씩 증가시키며 자기 자신을 더해 주어진 수 까지 나올때 까지 반복한다.
- 주어진 수가 되면 표현 하는 방법 카운트를 한다.
- 만일 더하다 주어진 수 보다 커질 경우 반복을 멈추고 카운트는 세지 않는다.
- 배열 안을 모두 순회하면 반복이 끝나고 카운트를 리턴한다.


3. 실행

4. 반성
- 처음에 계획했던 풀이 방법은 이중 반복문이 필요한 방법이라 계획대로 풀지 못했다.
- 재귀를 이용해서 풀 수 있을까..?