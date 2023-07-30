import solution from './GetCenterChar';

test('odd', () => {
  expect(solution('abcde')).toBe('c');
  expect(solution('abcdefghi')).toBe('e');
});

test('even', () => {
  expect(solution('qwer')).toBe('we');
});
