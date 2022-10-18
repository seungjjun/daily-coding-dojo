import {
  maximum, minimum, solution, split,
} from './MaximumAndMinimum';

test('split', () => {
  expect(split('4 3 2 1')).toStrictEqual(['4', '3', '2', '1']);
});

test('maximumValue', () => {
  expect(maximum(['3', '1', '4', '2'])).toBe(4);
});

test('minimumValue', () => {
  expect(minimum(['3', '1', '4', '2'])).toBe(1);
});

test('answer', () => {
  expect(solution('5 4 2 3 1')).toBe('1 5');
});

test('sameNumber', () => {
  expect(solution('-1 -1')).toBe('-1 -1');
});
