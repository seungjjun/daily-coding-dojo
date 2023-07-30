import { solution } from './CaesarCipher';

test('lowerCase', () => {
  expect(solution('bc', 2)).toBe('de');
  expect(solution('z', 1)).toBe('a');
  expect(solution('zyx', 3)).toBe('cba');
});

test('lowerCaseWithBlank', () => {
  expect(solution('b c', 2)).toBe('d e');
});

test('upperCase', () => {
  expect(solution('AB', 1)).toBe('BC');
});
