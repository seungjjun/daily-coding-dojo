## 문제
한 번에 K 칸을 앞으로 점프하거나(K만큼 건전지가 닳는다), 현재까지 온 거리 * 2에 해당하는 위치로 순간이동할 수 있는 아이언슈트로 주어진 거리 N을 건전지의 사용량의 최솟값을 구하는 문제


### 1. 이해
- 건전지는 점프할때만 닳는다 (K만큼 이동 시 K만큼 닳는다.)
- 순간이동은 현재 위치 * 2만큼 이동할 수 있다. (처음에는 0이기 때문에 이동 불가 -> 무조건 한번 점프해야함)
- 주어진 수 n에서 빼는식으로 접근해야할것 같다. 0에서 더하기를 하기에는 경우의 수가 너무 많아진다.

### 2. 계획
- 주어진 수 n이 0이 아니면 반복하는 while문을 생성한다.
- 만일 n을 2로 나눈 나머지가 0보다 크면 홀수이기 때문에 건전지 소모량을 n을 2로 나눈 나머지만큼 더하고 n을 나머지 만큼 뺀다.
- 만일 나머지가 짝수이면 (0이면), n을 2로 나눈 몫으로 변경시킨다.
- 위 과정을 n이 0이 될때까지 반복한다.

### 3. 실행

### 4. 반성
- 특별한 알고리즘이 필요하지 않았고, 정답을 어떻게 도출해낼 것인지 접근 방식이 중요했던 문제.
- 다른 풀이방식들을 봐도 대다수 홀수 짝수 개념으로 푼 것 같음.