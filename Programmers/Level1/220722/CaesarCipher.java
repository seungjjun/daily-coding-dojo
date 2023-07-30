public class CaesarCipher {
  public String solution(String sentence, int n) {
    String answer = "";

    int ascii = 0;

    for (int i = 0; i < sentence.length(); i += 1) {
      ascii = sentence.charAt(i);

      if(65 <= ascii && ascii <= 90) {
        ascii += n;

        if(ascii > 90) {
          ascii -= 26;
        }
      }

      if(97 <= ascii && ascii <= 122) {
        ascii += n;

        if(ascii > 122) {
          ascii -= 26;
        }
      }

      if(ascii < 65 || ascii > 122) {
        if(ascii == 32) {
          answer = answer + " ";
          continue;
        }
        ascii += n;
      }
      answer = answer + (char) ascii;

    }
    return answer;
  }
}
