import { add } from './AddDigit';

test('add', () => {
  expect(add(123)).toBe(6);
  expect(add(987)).toBe(24);
});
