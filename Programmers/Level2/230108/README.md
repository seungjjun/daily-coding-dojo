## 문제
스파이가 가지고 있는 의상들이 담긴 2차원 배열(의상의 이름, 의상의 종류)이 주어질 때, 서로 다른 옷의 조합의 수를 구하는 문제  
ex) [["yellow_hat", "headgear"], ["blue_sunglasses", "eyewear"], ["green_turban", "headgear"]] -> 5가지

### 1. 이해
- 하루에 최소 한개의 의상은 입어야 한다.
- 같은 의상의 종류는 2개이상 못 입는다.
- 의상의 이름은 중복되지 않는다.
- 

### 2. 계획
- 의상 하나를 key값으로 나머지 같이 입는 옷들은 value값으로 한다.
- 

### 3. 실행

코딩을 하는 단계입니다. 물론 Test case부터 먼저 작성 해야겠죠?

- 각 단계가 올바른지 명확히 알 수 있는가?
- 그것이 옳다는 것을 설명할 수 있는가?

질문을 보면 아시겠지만 이게 TDD를 같이 하는 이유입니다.

Test code를 통해 각 단계가 올바르게 동작하는 것을 증명할 수 있기 때문입니다.

사람의 머리로는 증명할 수 없습니다. 명심하세요! 증명은 코드를 통해 합니다.

### 4. 반성

반성이 제일 중요합니다. 반성한 부분을 다음날 훈련에 반영합니다.

- 다른 방법으로 해결할 수는 없었는가? (다른 사람의 풀이도 참고하면 좋습니다.)
- 결과나 방법을 다른 문제에 활용할 수 있는가? (유용한 패턴은 계속 써먹을 수 있죠.)