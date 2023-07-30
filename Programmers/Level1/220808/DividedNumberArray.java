// 반복문
public ArrayList<Integer> solution1(int[] arr, int divisor) {
  ArrayList<Integer> answer = new ArrayList<>();

  for(int i = 0; i < arr.length; i += 1) {
    if(arr[i] % divisor == 0) {
      answer.add(arr[i]);
    }
  }

  if(answer.size() == 0) {
    answer.add(-1);
  }

  Collections.sort(answer);

  return answer;
}

// stream
public int[] solution2(int[] arr, int divisor) {
    int[] answer = Arrays.stream(arr)
        .filter(number -> number % divisor == 0)
        .sorted()
        .toArray();

    if(answer.length == 0) {
      return new int[]{-1};
    }

    return answer;
}
