import { solution } from './KthNumber';

test('slice', () => {
  expect(solution([1, 5, 2, 6, 3, 7, 4], [[2, 5, 3]]))
    .toStrictEqual([2, 3, 5, 6]);
});

test('solution', () => {
  expect(solution([1, 5, 2, 6, 3, 7, 4], [[2, 5, 3], [4, 4, 1], [1, 7, 3]]))
    .toStrictEqual([5, 6, 3]);
});
