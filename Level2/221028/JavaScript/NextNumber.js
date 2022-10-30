export function toBinary(number) {
  return number.toString(2);
}

export function solution(number, nextNumber = number + 1) {
  return toBinary(number).match(/1/g).length
  === toBinary(nextNumber).match(/1/g).length
    ? nextNumber : solution(number, nextNumber + 1);
}
