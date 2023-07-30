function solution(number) {
  const stringNumber = `${number}`;
  const answer = new Array(stringNumber.length);

  for (let i = 0; i < stringNumber.length; i += 1) {
    answer[i] = parseInt(stringNumber.charAt(i));
  }

  return answer.reverse();
}
