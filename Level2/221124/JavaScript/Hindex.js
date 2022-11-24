export default function solution(citations) {
  let answer = 0;

  const h = citations.length;

  for (let i = h; i >= 1; i -= 1) {
    if (citations.filter((citation) => citation >= i).length >= i) {
      answer = Math.max(answer, i);
    }
  }

  return answer;
}
