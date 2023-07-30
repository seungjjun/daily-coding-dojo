public class Descending {
  public long solution(long n) {
    String answer = "";

    long[] array = new long[Long.toString(n).length()];

    array = descendingArray(n, array);

    for (int i = 0; i < array.length; i += 1) {
      answer += Long.toString(array[i]);
    }

    return Long.parseLong(answer);
  }

  public long[] descendingArray(long n, long[] array) {
    long quoient = n;

    for (int i = 0; i < Long.toString(n).length(); i += 1) {
      int remainder = (int) (quoient % 10);
      array[i] = remainder;
      quoient /= 10;
    }

    for (int i = 0; i < array.length - 1; i += 1) {
      for (int j = 0; j < array.length - 1 - i; j += 1) {
        if (array[j] < array[j + 1]) {
          int tmp = (int) array[j];
          array[j] = array[j + 1];
          array[j + 1] = tmp;
        }
      }
    }

    return array;
  }
}
