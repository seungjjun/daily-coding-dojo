import { solution } from './StrangeCharacters';

test('uppear', () => {
  expect(solution('try hello world')).toBe('TrY HeLlO WoRlD');
});

test('lower', () => {
  expect(solution('TRY HELLO WORLD')).toBe('TrY HeLlO WoRlD');
});
