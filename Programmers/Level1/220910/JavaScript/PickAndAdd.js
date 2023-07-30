export default function solution(numbers) {
  const answer = [];

  for (let i = 0; i < numbers.length; i += 1) {
    for (let j = i + 1; j < numbers.length; j += 1) {
      answer.push(numbers[i] + numbers[j]);
    }
  }

  answer.sort((a, b) => a - b);

  const set = new Set(answer);

  return [...set];
}
