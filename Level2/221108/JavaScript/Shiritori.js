export default function solution(n, words) {
  let count = 0;

  const hash = {};

  hash[words[0]] = true;

  words.slice(1).some((word, index) => {
    const previousWord = words[index];

    if (hash[word] || previousWord[previousWord.length - 1] !== word[0]) {
      count = index + 2;
      return true;
    }

    hash[word] = true;
  });

  if (!count) {
    return [0, 0];
  }

  return [count % n ? count % n : n, Math.ceil(count / n)];
}
