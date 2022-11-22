export default function solution(n) {
  const jumpWay = [1, 2];

  for (let i = 2; i < n; i += 1) {
    jumpWay[i] = (jumpWay[i - 1] + jumpWay[i - 2]) % 1234567;
  }

  return jumpWay[n - 1];
}
