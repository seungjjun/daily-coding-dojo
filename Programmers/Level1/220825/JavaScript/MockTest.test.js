import {
  solution, firstCountCompute, secoundCountCompute, thirdCountCompute,
} from './MockTest';

test('firstCount', () => {
  expect(firstCountCompute(0, [1, 3, 2, 4, 2])).toBe(2);
});

test('secondCount', () => {
  expect(secoundCountCompute(0, [1, 2, 4, 1, 2])).toBe(1);
});

test('thirdCount', () => {
  expect(thirdCountCompute(0, [3, 1, 1, 2, 4, 4, 4])).toBe(3);
});

test('solution', () => {
  expect(solution([1, 2, 3, 4, 5])).toStrictEqual([1]);
  expect(solution([1, 3, 2, 4, 2])).toStrictEqual([1, 2, 3]);
});
