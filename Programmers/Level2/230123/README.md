## 문제 
귤의 크기가 담긴 배열에서 귤 k개를 고를 떄, 크기가 서로 다른 종류의 수의 최솟값을 구하는 문제

### 1. 이해
- hashMap 문제 같다.
- 개수가 가장 많은 크기의 귤을 집으면 되는 문제인듯

### 2. 계획
- 귤을 hashMap에 옮겨 담는다. (key는 귤의 크기 value는 귤의 개수)
- value값 기준으로 정렬한다.
- 귤의 value가 가장 큰 값이 k보다 작으면 k - value 하고 answer + 1한다.
- 그리고 다음으로 value가 큰 값이 k와 비교
- 만일 k보다 크거나 같으면 return answer + 1 하고 끝낸다.
- 위 과정을 hashMap의 크기만큼 반복

### 3. 실행

### 4. 반성
- 간단한 구현 문제였음 (hashMap)
- 아직까지 hashMap에서 value값 기준으로 key값을 정렬하는법이 헷갈려서 찾아봤다.
- 다른 풀이를 찾아봐도 전부 비슷하게 푼것 같음
