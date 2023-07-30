public class CommonMultiple {
  public int solution(int[] arr) {
   int answer = computeMinimum(arr[0], arr[1]);

   for(int i = 2; i < arr.length; i += 1) {
     answer = computeMinimum(answer, arr[i]);
   }

   return answer;
  }

  public int computeMinimum(int a, int b) {
    int temp = 0;
    int initialNumberA = a;
    int initialNumberB = b;

    while (b != 0) {
      temp = a;
      a = b;
      b = temp % b;
    }

    return (initialNumberA * initialNumberB) / a;
  }
}
