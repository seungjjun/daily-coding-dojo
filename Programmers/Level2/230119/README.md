## 문제
자연수 n이 주어질 때, 1과 2와 4로만 모든 수로 표기하는 124 나라에서 사용하는 수로 변환하는 문제  
ex) 4 -> 11, 5 -> 12, 7 -> 21 ...

### 1. 이해
- 규칙이 있지 않을까?
- 3으로 나눴을때 나머지가 1이면 끝자리 숫자가 1
- 3으로 나눴을때 나머지가 2이면 끝자리 숫자가 2
- 3으로 나눴을떄 나눠떨어지면 끝자리 숫자가 4

### 2. 계획
- 주어진수 n이 3보다 작아질때까지 반복하는 while문 생성
- 주어진 수 n을 3으로 나눠서 나머지가 1이면 1, 2면 2, 나눠떨어지면 4를 맨 끝에 추가한다.
- 위에서 3으로 나눈 몫을 n으로 다시 바꾼다.
- 만일 나머지가 0이면 나눈 몫에 -1을 한 값을 n으로 바꾼다.
- 위 과정을 반복한다.

### 3. 실행

### 4. 반성
- n이 3보다 클떄가 아닌 0보다 클때로 while문의 조건을 변경하고 풀어도 되었음.
- 특별한 알고리즘을 사용해서 푸는 문제가 아닌 규칙성을 찾는 문제였다. (단순 구현 문제)
