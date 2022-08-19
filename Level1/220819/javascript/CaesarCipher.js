// eslint-disable-next-line import/prefer-default-export
export function solution(s, n) {
  const lowerCase = 'abcdefghijklmnopqrstuvwxyz';
  const upperCase = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ';

  const answer = {
    ciper: '',
  };

  for (let i = 0; i < s.length; i += 1) {
    if (s.charAt(i) === ' ') {
      answer.ciper += ' ';
      continue;
    }

    const sentence = lowerCase.includes(s.charAt(i)) ? lowerCase : upperCase;

    const char = {
      alphabet: sentence.indexOf(s.charAt(i)),
    };

    char.alphabet += n;

    if (char.alphabet > 25) {
      char.alphabet -= 26;
    }

    answer.ciper += sentence.charAt(char.alphabet);
  }

  return answer.ciper;
}
