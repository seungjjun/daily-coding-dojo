// 지도는 한 변의 길이가 n인 정사각형 배열 형태
// 각 칸은 공백 ("") 또는 벽("#") 두 종류로 이루어 짐
// 전체 지도는 지도 1과 지도 2와 합쳐진 지도이다
// 지도 1과 지도 2는 각각 정수 배열로 암호화 되어있음
// 각 가로줄로 벽 부분을 1, 공백 부분을 0으로 부호화했을 때 얻어지는 이진수에 해당하는 값의 배열

// 주어진 배열 안의 정수를 2진수로 변환하는 과정이 필요
// 두 배열 모두 2진수로 변환 후 지도1과 지도2의 2진수의 자릿수가 1인지 0인지 검사
// 둘 중 하나라도 1이면 #, 둘 다 0이면 공백

public class SecretMap {
  public String[] solution(int number, int[] arr1, int[] arr2) {
    String[] answer = new String[number];

    for (int i = 0; i < number; i += 1) {
      String firstMapBinary = Integer.toBinaryString(arr1[i]);
      if (firstMapBinary.length() < number) {
        for (int j = firstMapBinary.length(); j < number; j += 1) {
          firstMapBinary = "0" + firstMapBinary;
        }
      }

      String secondMapBinary = Integer.toBinaryString(arr2[i]);
      if (secondMapBinary.length() < number) {
        for (int j = secondMapBinary.length(); j < number; j += 1) {
          secondMapBinary = "0" + secondMapBinary;
        }
      }

      answer[i] = "";

      for (int j = 0; j < number; j += 1) {
        if (firstMapBinary.charAt(j) == '1' ||
            secondMapBinary.charAt(j) == '1') {
          answer[i] += "#";
        }
        if (firstMapBinary.charAt(j) == '0' &&
            secondMapBinary.charAt(j) == '0') {
          answer[i] += " ";
        }
      }
    }

    return answer;
  }
}
