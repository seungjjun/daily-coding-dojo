// "for the last week" ->	"For The Last Week"

public class JadenCase {
  public String solution(String s) {
    String[] words = split(s);

    return convert(words, s);
  }

  public String[] split(String sentence) {
    return sentence.split(" ");
  }


  public String convert(String[] sentences, String s) {
    String answer = "";

    for(int i=0; i<sentences.length; i++) {
      String str = sentences[i].toLowerCase();

      if(!str.equals("")) {
        str = String.valueOf(str.charAt(0)).toUpperCase() + str.substring(1);
      }

      answer += str + " ";
    }

    if(s.charAt(s.length()-1) != ' ') {
      answer = answer.trim();
    }
    return answer;
  }
}
