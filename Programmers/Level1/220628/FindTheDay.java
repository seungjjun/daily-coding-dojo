// 1 -> 31  1/1 FRI
// 2 -> 29  2/1 MON
// 3 -> 31  3/1 TUE
// 4 -> 30  4/1 FRI
// 5 -> 31  5/1 SUN
// 6 -> 30  6/1 WED
// 7 -> 31  7/1 FRI
// 8 -> 31  8/1 MON
// 9 -> 30  9/1 THU
// 10 -> 31 10/1 SAT
// 11 -> 30 11/1 TUE
// 12 -> 31 12/1 THU

public class FindTheDay {
  public String solution(int month, int day) {
    String answer = "";

    int lastDay[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    int sum = 0;
    for(int i = 0; i< month-1; i++){
      sum += lastDay[i];
    }

    sum += day;
    sum %= 7;

    answer = switch (sum) {
      case 0 -> "THU";
      case 1 -> "FRI";
      case 2 -> "SAT";
      case 3 -> "SUN";
      case 4 -> "MON";
      case 5 -> "TUE";
      case 6 -> "WED";
      default -> "";
    };

    return answer;
  }
}

//  잘못된 풀이
//  String answer = "";
//
//  String[] week1 = new String[] {"THU","FRI","SAT","SUN","MON","TUE","WED"};
//  String[] week2 = new String[] {"SUN","MON","TUE","WED","THU","FRI","SAT"};
//  String[] week3 = new String[] {"WED","TUE","FRI","SAT","SUN","MON","TUE"};
//  String[] week4 = new String[] {"SAT","SUN","MON","TUE","WED","THU","FRI"};
//  String[] week5 = new String[] {"TUE","WED","THU","FRI","SAT","SUN","MON"};
//  String[] week6 = new String[] {"WED","THU","FRI","SAT","SUN","MON","THE"};
//  String[] week7 = new String[] {"FRI","SAT","SUN","MON","TUE","WED","THU"};
//
//    answer = switch (month) {
//        case 1, 4, 7 -> week1[day%7];
//        case 2, 8 -> week2[day%7];
//        case 3, 11 -> week3[day%7];
//        case 5 -> week4[day%7];
//        case 6 -> week5[day%7];
//        case 9, 12 -> week6[day%7];
//        case 10 -> week7[day%7];
//        default -> "";
//    };
//
//    return answer;
