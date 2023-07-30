import { solution, toBinary } from './NextNumber';

test('toBinary', () => {
  expect(toBinary(78)).toBe('1001110');
});

test('solution', () => {
  expect(solution(78)).toBe(83);
});
