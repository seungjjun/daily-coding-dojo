### 문제
- 한번에 2명 밖에 탈 수 없고 무게제한이 있는 구명보트를 이용해 무인도에 갇힌 사람들의 몸무게가 주어질떄 구명보트를 최대한 적게 사용해서 모든 사람을 구출하는 문제
 ex) [70kg, 50kg, 80kg, 50kg], limit = 100 ==> 3 (50 + 50, 70, 80)
### 1. 이해
- 보트의 무게가 충분해도 한번에 2명 밖에 타지 못한다.
- 구명보트의 제한 무게는 항상 사람들의 몸무게 중 최댓값보다 크기 떄문에 못 구하는 경우는 없다.
- 한 명을 구하기 위해 몸무게를 검사해야하기 떄문에 한번 구하려고 시도할때 마다 모든 배열을 검사해야 한다.
- 최대 2명만 구할 수 있기 때문에 배열 맨 처음 사람을 선택하고 2명이 탈 수 있을떄 까지 검사하고 2명을 못태우면 카운트하고 다음 진행 
- 
### 2. 계획
- 구명 보트의 개수를 카운트할 변수를 생성한다.
- 이중 반복문으로 배열을 돌면서 주어진 보트의 제한 무게보다 적은지 검사
- 구조된 사람은 배열에서 제거
- --------------------------------------- 실패한 방법
- 사람들의 몸무게를 기준으로 오름차순 정렬한다,
- 구명보트의 수를 사람의 수로 할당해준다.
- 구조된 사람과 구조되지 않은 사람을 변수로 만들어 주고 구조되지 않은 사람의 수는 주어진 사람의 수로 할당
- 오름차순 정렬된 사람 배열에서 제일 가벼운사람과 제일 무거운 사람의 몸무게를 합쳐서 제한된 무게와 비교
- 제한된 무게 보다 무거우면 구조되지 않은 사람의 수를 1 줄이고 다시 처음부터 검사한다.
- 제한된 무게 보다 가벼우면 구조되지 않은 사람의 수는 1 줄이고 구조된 사람의 수는 1 늘리고 2명을 태웠으니 구명 보트 수는 1줄인다.
- 구조되지 않은 사람의 수 가 구조된 사람의 수 보다 적어지거나 같아질떄까지 반복한다.
### 3. 실행

### 4. 반성
- 처음에 이중 반복문으로 풀려고 했으나 2명이 구조 되었을때 2명을 제외하고 반복하는 로직이 복잡해서 실패함