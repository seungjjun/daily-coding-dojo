import { gcd, lcm, solution } from './LeastCommonMultiple';

test('gcd', () => {
  expect(gcd(6, 3)).toBe(3);
});

test('lcom', () => {
  expect(lcm(2, 7)).toBe(14);
});

test('solution', () => {
  expect(solution([2, 6, 8, 14])).toBe(168);
});
