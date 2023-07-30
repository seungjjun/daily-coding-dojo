// 다트게임은 총 3번의 기회
// 점수는 0~10점 사이 획득 가능
// S영역 -> 점수 1제곱 D영역 -> 점수 2제곱 T영역 -> 점수 3제곱
// 스타상 (*) -> 해당 점수와 바로 전의 점수를 2배, 아차상(#) 해당 점수 마이너스
// 스타상은 첫번째애 나올 수 있음 그럴 경우 이전 점수가 없기 떄문에 해당 점수만 2배
// 스타상은 중첩가능 2D* 2T* 이면 = (2^2 * 2 * 2 + 2^3 * 2)  이전 점수는 4배 해당 점수는 2배
// 스타상은 아차상과도 중첩이 가능하며 중첩이 되면 -2배
// 스타상과 아차상은 한 점수에 하나만 존재가능하며, 없을 수 도 있음

public class DartGame {
  public int solution(String dartResult) {
    int answer = 0;
    String number = dartResult.replaceAll("[^0-9]", "");
    String withoutNumber = dartResult.replaceAll("[0-9]", "");

    int firstGameNumber= Integer.parseInt(String.valueOf(number.charAt(0)));
    int secondGameNumber= Integer.parseInt(String.valueOf(number.charAt(1)));
    int thirdGameNumber= Integer.parseInt(String.valueOf(number.charAt(2)));

    String[] withoutNumberArray = withoutNumber.split("");

    for (int i = 0; i < 3; i += 1) {
      if(withoutNumberArray[i].equals("S")) {
        answer += (int) Math.pow(firstGameNumber, 1);
      }
      if(withoutNumberArray[i].equals("D")) {
        answer += (int) Math.pow(firstGameNumber, 2);
      }
      if(withoutNumberArray[i].equals("T")) {
        answer += (int) Math.pow(firstGameNumber, 3);
      }
    }

    for (int i = 2; i < 5; i += 1) {
      if(withoutNumberArray[i].equals("S")) {
        answer += (int) Math.pow(secondGameNumber, 1);
      }
      if(withoutNumberArray[i].equals("D")) {
        answer += (int) Math.pow(secondGameNumber, 2);
      }
      if(withoutNumberArray[i].equals("T")) {
        answer += (int) Math.pow(secondGameNumber, 3);
      }
    }

    for (int i = 5; i < withoutNumberArray.length; i += 1) {
      if(withoutNumberArray[i].equals("S")) {
        answer += (int) Math.pow(thirdGameNumber, 1);
      }
      if(withoutNumberArray[i].equals("D")) {
        answer += (int) Math.pow(thirdGameNumber, 2);
      }
      if(withoutNumberArray[i].equals("T")) {
        answer += (int) Math.pow(thirdGameNumber, 3);
      }
    }

    return answer;
  }
}
