문제
알파벳 소문자로 이루어진 문자열에서 같은 알파벳이 2개 연속으로 있을 경우 제거하고 문자열을 붙여서 모든 문자열이 제거될떄까지 반복한다. 다 지워지면 1을 리턴 지워지지 않으면 0을 리턴

1. 이해 
- 문자열을 지우고 앞뒤로 붙인 다음 다시 맨 처음 알파벳 부터 검사한다.
- for문을 사용하지 않고 반복하기 위해 문자열을 배열로 만들어야 할 듯
- 속도도 중요한 문제이기 떄문에 스택을 고려해야 한다.

3. 계획
- 스택을 이용할 빈 배열을 생성한다
- 문자열을 처음부터 돌면서 스택 배열이 비어있으면 문자열의 단어를 넣는다
- 배열안에 값이 있으면 문자열 배열의 단어와 비교해 같으면 꺼내고 다르면 넣는다.
- 위 과정을 문자열 배열 끝까지 반복한다.
- 스택 배열안에 값이 없으면 1리턴 있으면 0리턴

4. 실행

5. 반성
- 스택같은 자료구조는 속도가 빨라 효율성 테스트가 있는 문제에서는 스택 사용 여부를 고민해도 좋을것 같음
