import { binaryTransformation, removeZero, solution } from './RepeatBinaryTransformation';

test('removeZero', () => {
  expect(removeZero('110010101001')).toBe('111111');
});

test('binary', () => {
  expect(binaryTransformation(4)).toBe('100');
});

test('solution', () => {
  expect(solution('110010101001')).toStrictEqual([3, 8]);
});
