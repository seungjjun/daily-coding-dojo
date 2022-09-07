import solution from './HidePhoneNumbe';

test('solution', () => {
  expect(solution('01012345678')).toBe('*******5678');
  expect(solution('029381234')).toBe('*****1234');
});
