import { highestNumber, lowestNumber, solution } from './Lotto';

test('assumeRightNumber', () => {
  expect(highestNumber(
    [44, 1, 0, 0, 31, 25],
    [31, 10, 45, 1, 6, 19],
  ))
    .toBe(4);

  expect(highestNumber(
    [0, 0, 0, 0, 0, 0],
    [38, 19, 20, 40, 15, 25],
  ))
    .toBe(6);
});

test('assumeWrongNumber', () => {
  expect(lowestNumber(
    [44, 1, 0, 0, 31, 25],
    [31, 10, 45, 1, 6, 19],
  ))
    .toBe(2);

  expect(lowestNumber(
    [0, 0, 0, 0, 0, 0],
    [38, 19, 20, 40, 15, 25],
  ))
    .toBe(0);
});

test('lottoRankResult', () => {
  expect(solution(
    [44, 1, 0, 0, 31, 25],
    [31, 10, 45, 1, 6, 19],
  ))
    .toStrictEqual([3, 5]);

  expect(solution(
    [0, 0, 0, 0, 0, 0],
    [1, 2, 3, 4, 5, 6],
  ))
    .toStrictEqual([1, 6]);

  expect(solution(
    [1, 2, 3, 4, 5, 6],
    [7, 8, 9, 10, 11, 12],
  ))
    .toStrictEqual([6, 6]);
});
