public class RepeatBinaryTransformation {
  public int[] solution(String s) {
    int[] answer = new int[2];

    int zeroCount = 0;
    int binaryCount = 0;

    while(s.contains("0") || s.length() != 1) {
      String newSentence = s.replaceAll("0", "");
      zeroCount += s.length() - newSentence.length();
      s = Integer.toBinaryString(newSentence.length());
      binaryCount += 1;
    }

    answer[0] = binaryCount;
    answer[1] = zeroCount;

    return answer;
  }
}
