## 문제
0 또는 양의 정수가 단긴 배열이 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 구하는 문제  
ex) [6, 10, 2] => 6210
 
### 1. 이해
- 정답은 문자열로 바꿔야 한다.
- 큰 숫자가 더 앞에 오지만 10의 배수인 경우에는 더 작다고 판단한다. 
- 맨 앞 자리수가 가장 큰 수가 먼저 와야 한다.
- 만일 맨 앞 자리수가 같은 수가 존재하면 뒤에 오는 숫자를 비교해서 더 큰수가 앞에 온다. 
- 만일 뒤에 오는 숫자가 없는 경우에는 뒤에 숫자가 있는 숫자가 더 큰것으로 간주 하는데 뒤에 오는 숫자가 모두 0일 경우에는 더 작것으로 간주한다.

### 2. 계획
- 주어진 배열을 String 형태의 배열에 모두 담는다.
- 주어진 배열을 내림차순 정렬을 한다.
- 배열의 원소가 10의 배수(30)인 경우에는 일의 자리 수 보다 작다고 판단이 되기때문에 자리를 바꿔준다. 
- 위 과정을 배열의 길이만큼 반복한다.
- 배열의 첫번째 부터 이어 붙인다.

### 3. 실행

### 4. 반성
- 주어진 배열의 원소가 모두 0일때를 생각해야 했다. -> "000"이 아니라 "0"이 되어야 했음(edge case)
- 단순히 큰 숫자가 앞에 오는것이 아니라 비교하는 두 숫자를 앞, 뒤로 더해서 더 큰 숫자가 앞에 오도록 해야하는 문제였음
- compareTo 활용법 공부 필요