export default function solution(number) {
  const answer = {
    sum: 0,
  };

  for (let i = 1; i <= number; i += 1) {
    if (number % i === 0) {
      answer.sum += i;
    }
  }

  return answer.sum;
}
