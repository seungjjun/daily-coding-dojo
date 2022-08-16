public int solution1(int n) {
    int answer = 0;

    String number = Integer.toString(n);

    for (int i = 0; i < number.length(); i += 1) {
    answer += Character.getNumericValue(number.charAt(i));
    }

    return answer;
}

public int solution2(int n) {
    int answer;

    int numberLength = String.valueOf(n).length();
    int[] array = new int[numberLength];

    for (int i = 0; i < numberLength; i += 1) {
      array[i] = Character.getNumericValue(String.valueOf(n).charAt(i));
    }

    answer = Arrays.stream(array).sum();

    return answer;
}
