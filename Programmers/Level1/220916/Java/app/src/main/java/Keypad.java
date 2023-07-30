public class Keypad {
  public String solution(int[] numbers, String hand) {
    String answer = "";

    String leftHandLocation = "10";
    String rightHandLocation = "12";

    for (int i = 0; i < numbers.length; i += 1) {
      switch (numbers[i]) {
        case 1, 4, 7 -> {
          answer += "L";
          leftHandLocation = String.valueOf(numbers[i]);
        }
        case 3, 6, 9 -> {
          answer += "R";
          rightHandLocation = String.valueOf(numbers[i]);
        }

        case 2, 5, 8, 0 -> {
          if (numbers[i] == 0) {
            numbers[i] += 11;
          }

          int previousRightHandLocation =
              (Math.abs(numbers[i] - Integer.parseInt(rightHandLocation)) / 3 +
                  Math.abs(numbers[i] - Integer.parseInt(rightHandLocation)) % 3);

          int previousLeftHandLocation =
              (Math.abs(numbers[i] - Integer.parseInt(leftHandLocation)) / 3 +
                  Math.abs(numbers[i] - Integer.parseInt(leftHandLocation)) % 3);

          if (previousLeftHandLocation == previousRightHandLocation) {
            if (hand.equals("right")) {
              answer += "R";
              rightHandLocation = String.valueOf(numbers[i]);
              continue;
            }
            if (hand.equals("left")) {
              answer += "L";
              leftHandLocation = String.valueOf(numbers[i]);
              continue;
            }
            if (numbers[i] == 0) {

              if (hand.equals("left")) {
                answer += "L";
                leftHandLocation = String.valueOf(numbers[i]);
                continue;
              }

              if (hand.equals("right")) {
                answer += "R";
                rightHandLocation = String.valueOf(numbers[i]);
                continue;
              }
            }
          }

          if (previousRightHandLocation > previousLeftHandLocation
          ) {
            answer += "L";
            leftHandLocation = String.valueOf(numbers[i]);
            continue;
          }

          if (previousLeftHandLocation > previousRightHandLocation) {
            answer += "R";
            rightHandLocation = String.valueOf(numbers[i]);
            continue;
          }
        }
      }
    }

    return answer;
  }
}
