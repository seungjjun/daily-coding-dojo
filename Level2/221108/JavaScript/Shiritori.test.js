import solution from './Shiritori';

test('solution', () => {
  expect(solution(3, ['tank', 'kick', 'know', 'wheel', 'land', 'dream', 'mother', 'robot', 'tank']))
    .toStrictEqual([3, 3]);

  expect(solution(2, ['hello', 'one', 'even', 'never', 'now', 'world', 'draw']))
    .toStrictEqual([1, 3]);
});
