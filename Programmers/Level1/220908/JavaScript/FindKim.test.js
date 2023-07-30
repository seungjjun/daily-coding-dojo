import { solution, findKim } from './FindKim';

test('find', () => {
  expect(findKim(['Jane', 'Kim'])).toBe(1);
});

test('solution', () => {
  expect(solution(['Jane', 'Jun', 'Kim'])).toBe('김서방은 2에 있다');
});
