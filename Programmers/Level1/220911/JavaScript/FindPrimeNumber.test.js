import { numberArray, solution } from './FindPrimeNumber';

// test('numberArray', () => {
//   expect(numberArray(10)).toStrictEqual([2, 3, 4, 5, 6, 7, 8, 9, 10]);
// });

test('find', () => {
  expect(solution(10)).toBe(4);
});
