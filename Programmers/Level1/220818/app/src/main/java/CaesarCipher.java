public class CaesarCipher {
  public String solution(String s, int n) {
    String answer = "";

    String lower = "abcdefghijklmnopqrstuvwxyz";
    String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    for(int i = 0; i < s.length(); i += 1) {
      if(s.charAt(i) == ' ') {
        answer += ' ';
        continue;
      }
      if(Character.isUpperCase(s.charAt(i))) {
        answer += upper.charAt((upper.indexOf(s.charAt(i)) + n) % 26);
      }
      if(Character.isLowerCase(s.charAt(i))) {
        answer += lower.charAt((lower.indexOf(s.charAt(i)) + n) % 26);
      }
    }

    return answer;
  }
}
