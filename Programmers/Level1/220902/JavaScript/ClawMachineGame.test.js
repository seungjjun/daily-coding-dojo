import { pickDolls, removeSameDoll, solution } from './ClawMachineGame';

test('pickOne', () => {
  expect(pickDolls([], [
    [0, 0, 0, 0, 0],
    [0, 0, 1, 0, 3],
    [0, 2, 5, 0, 1],
    [4, 2, 4, 4, 2],
    [3, 5, 1, 3, 1],
  ], [1])).toStrictEqual([4]);
});

test('pickTwo', () => {
  expect(pickDolls([], [
    [0, 0, 0, 0, 0],
    [0, 0, 1, 0, 3],
    [0, 2, 5, 0, 1],
    [4, 2, 4, 4, 2],
    [3, 5, 1, 3, 1],
  ], [1, 2])).toStrictEqual([4, 2]);
});

// test('removeWithSameDoll', () => {
//   expect(removeSameDoll([4, 2, 2, 1])).toStrictEqual([4, 1]);
// });

test('pickOne', () => {
  expect(solution([
    [0, 0, 0, 0, 0],
    [0, 0, 1, 0, 3],
    [0, 2, 5, 0, 1],
    [4, 2, 4, 4, 2],
    [3, 5, 1, 3, 1],
  ], [1, 5, 3, 5, 1, 2, 1, 4])).toBe([4]);
});
