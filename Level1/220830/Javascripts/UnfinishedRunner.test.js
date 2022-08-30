import { solution } from './UnfinishedRunner';

test('solution1', () => {
  expect(solution(['leo', 'kiki', 'eden'], ['eden', 'kiki'])).toBe('leo');
});

test('solution2', () => {
  expect(solution(
    ['marina', 'josipa', 'nikola', 'vinko', 'filipa'],
    ['josipa', 'filipa', 'marina', 'nikola'],
  ))
    .toBe('vinko');
});

test('solution3', () => {
  expect(solution(
    ['mislav', 'stanko', 'mislav', 'ana'],
    ['stanko', 'ana', 'mislav'],
  ))
    .toBe('mislav');
});
