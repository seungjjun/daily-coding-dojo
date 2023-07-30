public class RightBracket {
  boolean solution(String s) {
    boolean answer;

    answer = isMatch(s);

    if(s.charAt(0) == ')') {
      answer = false;
    }

    return answer;
  }

  public boolean isMatch(String s) {
    boolean isMatch = true;

    int count = 0;

    for(int i = 0; i < s.length(); i += 1) {
      if(s.charAt(i) == '(') {
        count += 1;
      }

      if(s.charAt(i) == ')') {
        count -= 1;
      }

      if(count < 0) {
        break;
      }
    }

    if(count != 0) {
      isMatch = false;
    }

    return isMatch;
  }
}
