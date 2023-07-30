import { descending, solution } from './Descending';

test('descending', () => {
  expect(descending(118372)).toStrictEqual([8, 7, 3, 2, 1, 1]);
});

test('answer', () => {
  expect(solution(118372)).toStrictEqual(873211);
});
