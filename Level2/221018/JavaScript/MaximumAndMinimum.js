export function split(s) {
  return s.split(' ');
}

export function maximum(splitedArray) {
  return Math.max(...splitedArray);
}

export function minimum(splitedArray) {
  return Math.min(...splitedArray);
}

export function solution(s) {
  const splitedArray = split(s);
  const maximumValue = maximum(splitedArray);
  const minimumValue = minimum(splitedArray);

  const answer = `${minimumValue} ${maximumValue}`;

  return answer;
}
