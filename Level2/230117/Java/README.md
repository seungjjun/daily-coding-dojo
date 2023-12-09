## 문제
선행 스킬 순서 skill과 유저들이 만든 스킬트리를 담은 배열 skill_trees가 매개변수로 주어질 때, 가능한 스킬트리 개수를 구하는 문제

### 1. 이해
- 선행 스킬은 어떤 스킬을 배우기 전에 먼저 배워야 하는 스킬이다.
- 선행 스킬 순서가 스파크 -> 라이트닝 볼트 -> 썬더 일때 라이트닝 볼트를 배우려면 스파크 부터 배워야 한다.
- 스킬은 중복해서 주어지지 않는다.
- 스킬은 대문자로 표기된다.

### 2. 계획
- 선행 스킬 순서를 한글자씩 나눠서 배열로 만든다.
- 배열로 만든 스킬들을 큐를 생성해 모두 넣는다.
- 이중반복문을 만들어서 첫 반복문은 스킬트리 배열만큼 반복하고 안의 반복문은 주어진 스킬 문자열의 길이만큼 반복한다.
- 큐 안에서 하나 꺼낸 알파벳과 스킬트리 배열 스킬의 첫번째 알파벳이 같지 않고 큐 안에 존재하는 알파벳일 경우 카운트를 하지 않고 break한다. 
- 만일 알파벳이 스킬큐 안에 없는 알파벳이면 continue 한다.
- 만일 스킬큐가 전부 비워졌으면 카운트 1 하고 break한다.
- 안에 반복문이 끝나는 시점에 스킬큐를 모두 비운다음 다시 주어진 선행스킬순서로 채운다.

### 3. 실행

### 4. 반성
- 선행스킬에 없는 스킬트리로만 이루어져있을 경우도 생각해야 했다.
- 다른사람의 풀이로 iterator와 정규식을 이용해 간단히 풀 수 있는 방법이 있었는데 정규식을 이용한 풀이는 생각조차 못했다. (replaceAll("[^" + skill + "]", ""))
- 그래도 처음에 계획한 방법대로 풀 수 있었던 문제