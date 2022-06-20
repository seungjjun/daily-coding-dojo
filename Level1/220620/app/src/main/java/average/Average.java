
package average;

public class Average {
  public double average(int[] array) {

    double sum = 0;

    for (int i = 0; i < array.length; i += 1) {
      sum += array[i];
    }

    return sum / array.length;
  }
}
