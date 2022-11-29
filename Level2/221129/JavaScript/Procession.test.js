import solution from './Procession';

test('solution', () => {
  expect(solution([[1, 4], [3, 2], [4, 1]], [[3, 3], [3, 3]]))
    .toStrictEqual([[15, 15], [15, 15], [15, 15]]);
});
