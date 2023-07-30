public class StrangeCharacters {
  public String solution(String s) {
    String answer = "";

    s = s.toLowerCase();

    String[] characters = s.split(" ", -1);

    for (int i = 0; i < characters.length; i += 1) {
      for (int j = 0; j < characters[i].length(); j += 1) {
        if (j % 2 == 0) {
          answer += Character.toUpperCase(characters[i].charAt(j));
        }
        if (j % 2 != 0) {
          answer += characters[i].charAt(j);
        }
      }
      answer += " ";
    }

    return answer.substring(0, answer.length() - 1);
  }
}
