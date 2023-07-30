export default function solution(s) {
  const answer = {
    letter: '',
  };

  if (s.length % 2 !== 0) {
    answer.letter = s.charAt(s.length / 2);
  }

  if (s.length % 2 === 0) {
    answer.letter += s.charAt(s.length / 2 - 1);
    answer.letter += s.charAt(s.length / 2);
  }

  return answer.letter;
}
