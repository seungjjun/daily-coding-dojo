import { solution } from './ConverToNumber';

test('convert', () => {
  expect(solution('one')).toBe(1);
  expect(solution('two')).toBe(2);
  expect(solution('twothree3')).toBe(233);
});

test('solution', () => {
  expect(solution('one4seveneight')).toBe(1478);
  expect(solution('23four5six7')).toBe(234567);
  expect(solution('14')).toBe(14);
});
