export function squareRoot(brown, yellow) {
  return ((2 + brown / 2)
  + Math.sqrt((2 + brown / 2)
  ** 2 - 4 * (brown + yellow))) / 2;
}

export function solution(brown, yellow) {
  const x = squareRoot(brown, yellow);
  const y = brown / 2 + 2 - x;
  return [x, y];
}
