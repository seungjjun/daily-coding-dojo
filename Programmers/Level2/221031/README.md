# 문제
주어진 갈색 격자의 수와 노란색 격자의 수로 카펫의 가로 세로 크기를 구하는 문제  
ex) 갈색 10 노란색 2 -> [4, 3]
### 1. 이해
1. 가로 길이는 세로길이보다 항상 같거나 길다.
2. 노란색 격자의 수가 하나 늘어나면 갈색 격자의 수는 몇개가 늘어날까? 규칙성이 있나?  --> 2개씩 늘어남  
--> 성립 x 노란색이 항상 1줄일때만 2씩 늘어남
3. 노란색 격자의 배치에 따라 필요한 가로가 달라지기 떄문에 주어진 가로길이로 노란색의 배치를 추정 가능
4. 2개씩 늘어나는 규칙성으로 뭔가를 해볼 수 있지 않을까?
### 2. 계획
1. 주어진 갈색의 수와 노란색의 수를 합한다.
2. 합한 수를 최대 크기로 인수 분해될때 까지 반복 한다 ex) 48 -> 8 x 6
3. 가로격자의 수 8 * 2 세로격자의 수 6 * 2인데 모서리 4부분이 중복되기 때문에 - 4
4. 위 결과가 갈색의 수와 맞으면 가로 길이는 가로 격자의 수 / 2 세로 길이는 세로 격자의 수 / 2
5. 8이 가로길이 6이 세로길이
### 3. 실행

### 4. 반성
1. 반복하면서 하나의 수가 도출되어야 하기 떄문에 재귀로 풀 수는 없을까??