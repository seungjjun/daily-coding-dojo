export function removeZero(sentence) {
  return sentence.replaceAll('0', '');
}

export function binaryTransformation(sentence) {
  const binary = sentence.toString(2);
  return binary;
}

export function solution(s) {
  const sentence = {
    initialSentence: s,
  };

  const answer = [];

  const count = {
    countZero: 0,
    countTransformation: 0,
  };

  while (sentence.initialSentence !== '1') {
    const newSentence = removeZero(sentence.initialSentence);
    count.countZero += sentence.initialSentence.length - newSentence.length;
    sentence.initialSentence = binaryTransformation(newSentence.length);
    count.countTransformation += 1;
  }

  answer[0] = count.countTransformation;
  answer[1] = count.countZero;

  return answer;
}
