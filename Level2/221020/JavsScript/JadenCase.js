export function firstWordToUpperCase(lowerCaseSentence) {
  return lowerCaseSentence.map((word, index) => {
    if (lowerCaseSentence[index - 1] === ' ' || index === 0) {
      return word.toUpperCase();
    }

    return word;
  }).join('');
}

export function toArray(sentence) {
  return [...sentence];
}

export function convertToLowerCase(sentence) {
  return sentence.toLowerCase();
}

export function solution(s) {
  const lowerCaseSentence = convertToLowerCase(s);

  const array = toArray(lowerCaseSentence);

  return firstWordToUpperCase(array);
}
