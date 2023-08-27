### 1. 이해

> 아래의 질문에 대한 답변이 녹아 있어야 한다.

- [ ] 모르는 것은 무엇인가?
- [ ] 주어진 것은 무엇인가?
- [ ] 자료는 무엇인가?
- [ ] 조건은 무엇인가?
- [ ] 조건은 알아내야 하는 것을 찾는데 충분한가?

### 2. 계획

> A) 계획을 세우기 전에 아래와 같은 질문을 던지면 굉장히 유용하다.

- [ ] 관련된 문제를 알고 있는가?
- [ ] 모르는 부분이 유사한 다른 문제를 풀어 본 적이 있는가?
- [ ] 전에 풀어 본 문제를 활용하려면 어떤 보조 요소를 도입해야 되는가?
- [ ] 도움이 될 것 같은 어떤 사실이나 정리를 알고 있는가? (보통은 자료 구조나 수학적 공리 또는 정의가 해당됨)

> B) 계획을 세운 뒤 아래 질문을 통해 한번 더 점검해보자.

- [ ] 자료와 조건은 모두 활용 했는가? (Edge case가 될 조건을 꼭 확인해야 함)

### 3. 실행

> 코딩을 하는 단계! 무조건 Test case부터 먼저 작성해야 한다.
> 💡 TDD를 같이 하는 이유: Test code를 통해 각 단계가 올바르게 동작하는 것을 증명할 수 있다.

- [ ] 각 단계가 올바른지 명확히 알 수 있는가?
- [ ] 그것이 옳다는 것을 설명할 수 있는가?

### 4. 반성

> 문제를 다 풀고 나서 회고하는 시간을 갖는다. 반성한 부분을 다음 문제 풀이에 반영한다.

- [ ] 다른 방법으로 해결할 수는 없었는가? (이때 다른 사람의 풀이도 참고하면 좋음)
- [ ] 결과나 방법을 다른 문제에 활용할 수 있는가? (유용한 패턴은 따로 정리해두자)

### 1. 이해

- 주어진 알파벳에서 index만큼 뒤에 있는 알파벳을 선택
- 주어지는 skip 배열안에 있는 알파벳은 순번에서 제외
- 알파벳은 소문자만 주어진다
- z가 넘어가면 a부터 시작

### 2. 계획

- 아스키코드를 활용해서 풀 수 있을것 같다. (97(a) ~ 122(z))
- skip 배열의 알파벳을 아스키코드로 변환해서 set에 저장한다.
- 주어진 s의 길이만큼 반복하는 반복문을 통해 s의 문자 하나씩 아스키코드로 변환한다.
- 아스키코드를 index만큼 1씩 증가시키면서 set에 있는지 검사하고 있으면 1 증가시킨다.
- 아스키코드를 다시 문자로 변환해서 문자열에 더한다.

### 3. 실행

### 4. 반성

- 굳이 set을 사용해서 저장하지 않아도 toCharArray와 String.valudOf를 이용해서 풀 수 있었다.