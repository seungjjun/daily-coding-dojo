import { solution, sum, decimals } from './MakeDecimal';

test('sum', () => {
  expect(sum([1, 2, 3, 4])).toStrictEqual([6, 7, 8, 9]);
  expect(sum([1, 2, 7, 6, 4])).toStrictEqual([10, 9, 7, 14, 12, 11, 15, 13, 12, 17]);
});

test('decimals', () => {
  expect(decimals([6, 7, 8, 9])).toStrictEqual([7]);
  expect(decimals([10, 9, 7, 14, 12, 11, 15, 13, 17])).toStrictEqual([7, 11, 13, 17]);
});

test('answer', () => {
  expect(solution([1, 2, 3, 4])).toBe(1);
  expect(solution([1, 2, 7, 6, 4])).toBe(4);
  expect(solution([1, 6, 4])).toBe(1);
});
