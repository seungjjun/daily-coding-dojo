## 문제
캐시 크기와 도시이름 배열이 주어질때 캐시 크기에 따른 도시 이름을 검색하는 실행 시간을 구하는 문제

### 1. 이해
- 캐시 교체 알고리즘 LRU를 알아야 할 것 같다.
- 실행시간 : hit -> 1, miss -> 5
- 스택을 사용해야 할것 같음
- 대소문자는 구분하지 않는다
- 캐시 사이즈가 0일떄도 있음

### 2. 계획
- 스택을 생성한다.
- 도시 배열안의 도시 이름을 대문자가 있을 경우를 대비해 모두 소문자로 변경
- 첫번째 도시이름을 스택안에 넣는다.
- 두번째 이름을 넣을때 스택안에 똑같은 도시 이름 있는지 검사한다.
- 있으면 hit -> 1, 없으면 miss -> 5 실행시간을 더한다.
- 캐시 크기만큼 스택이 가득차면 맨 처음에 넣었던 도시 이름은 제거한다.
- 위 과정을 도시 이름 배열을 다 돌때까지 반복한다.
- 마지막 실행시간을 리턴
- 만일 캐시 크기가 0이면 배열 크기 * 5하고 리턴 위 과정이 필요가 없어진다.

### 3. 실행

### 4. 반성
- 스택말고도 arrayList 자료구조를 사용해서 풀 수 있는 것 같다.
- 배열안의 값을 반복적으로 추가하거나 제거해야할떄 스택읆 먼저 떠올려 보는것도 괜찮은 것 같다.