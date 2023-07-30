export function gcd(a, b) {
  return b ? gcd(b, a % b) : a;
}

export function lcm(a, b) {
  return (a * b) / gcd(a, b);
}

export function solution(arr) {
  return arr.reduce((a, b) => lcm(a, b));
}
