export default function solution(people, limit) {
  let answer = 0;
  people.sort((a, b) => b - a);

  for (let left = 0, right = people.length - 1; left <= right; left += 1) {
    answer += 1;

    if (limit - people[left] >= people[right]) {
      right -= 1;
    }
  }

  return answer;
}
