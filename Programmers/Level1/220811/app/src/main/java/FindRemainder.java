public int solution1(int n) {
  int answer = 0;

  for(int i = 1; i < n; i += 1){
    if(n % i == 1) {
      return i;
    }
  }

  return answer;
}


public int solution2(int n) {
    int answer = 0;

    ArrayList<Integer> remainders = new ArrayList<>();

    for(int i = 1; i < n; i += 1) {
      if(n % i == 1) {
        remainders.add(i);
      }
    }

    return remainders.get(0);
}