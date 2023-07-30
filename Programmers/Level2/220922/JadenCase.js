export function firstWordToUpperCase(lowerCaseSentence) {
  return lowerCaseSentence.map((word, index) => (
    lowerCaseSentence[index - 1] === ' ' || index === 0
      ? word.toUpperCase()
      : word.toLowerCase()))
    .join('');
}

export function toArray(sentence) {
  return [...sentence];
}

// export function convertToLowerCase(sentence) {
//   return sentence.toLowerCase();
// }

export function solution(s) {
//   const lowerCaseSentence = convertToLowerCase(s);

  const array = toArray(s);

  return firstWordToUpperCase(array);
}
