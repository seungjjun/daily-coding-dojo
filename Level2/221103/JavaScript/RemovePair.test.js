import { remove, solution, toArray } from './RemovePair';

test('wordsToArray', () => {
  expect(toArray('baabaa')).toStrictEqual(['b', 'a', 'a', 'b', 'a', 'a']);
});

test('removeWord', () => {
  expect(remove(['b', 'a', 'a', 'b', 'a', 'a'])).toStrictEqual([]);
  expect(remove(['c', 'd', 'c', 'd'])).toStrictEqual(['c', 'd', 'c', 'd']);
});

test('solution', () => {
  expect(solution('baabaa')).toBe(1);
  expect(solution('cdcd')).toBe(0);
});
