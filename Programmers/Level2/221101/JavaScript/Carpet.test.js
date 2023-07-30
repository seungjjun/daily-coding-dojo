import { solution, squareRoot } from './Carpet';

test('squareRoot', () => {
  expect(squareRoot(24, 24)).toBe(8);
});

test('solution', () => {
  expect(solution(24, 24)).toStrictEqual([8, 6]);
});
