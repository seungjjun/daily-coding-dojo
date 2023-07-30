export function findKim(seoul) {
  return seoul.findIndex((v) => v === 'Kim');
}

export function solution(seoul) {
  const location = findKim(seoul);

  const answer = `김서방은 ${location}에 있다`;

  return answer;
}
