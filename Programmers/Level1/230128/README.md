## 문제
[빵 - 야채 - 고기 - 빵] 순서로 햄버거를 만들어야 할때 주어지는 재료로 몇개의 햄버거를 만들 수 있는지 고하는 문제

### 1. 이해
- 주어지는 정수 배열에서 1 - 빵, 2 - 야채, 3 - 고기를 의미한다.
- 주어진 재료는 순서를 변경해서 빵을 만들 수 없다.
- 햄버거는 빵(1) - 야채(2) - 고기(3) - 빵(1) 순으로 만들어야 한다.

### 2. 계획
- 햄버거 재료를 담을 스택을 만든다.
- 주어지는 재료 배열의 길이만큼 반복을 한다.
- 스택에 주어지는 배열을 차례로 넣는다.
- 만일 스택에 사이즈가 4이상이고, 스택에서 첫번째로 꺼낸 재료의 값이 1이고, 두번째로 꺼낸 값이 3, 세번째로 꺼낸 값이 2, 네번쨰로 꺼낸 값이 4이면 햄버거를 만든다
- 그리고 스택에서 재료 4개를 꺼낸다.
- 위 과정을 반복

### 3. 실행

### 4. 반성
- 시간 초과될까봐 스택을 사용해야 되지 않을까 생각했었는데 스택을 안쓰고 배열을 이용해서 더 간단하게 풀 수 있었다.
