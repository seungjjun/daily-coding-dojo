/* eslint-disable import/prefer-default-export */
export function add(n) {
  let answer = 0;

  const numberLength = `${n}`.length;

  let quoient = n;

  for (let i = 0; i < numberLength; i += 1) {
    const remainder = parseInt(quoient % 10);
    quoient /= 10;
    answer += remainder;
  }

  return answer;
}
