import solution from './Tuple';

test('solution', () => {
  expect(solution('{{2},{2,1},{2,1,3},{2,1,3,4}}'))
    .toStrictEqual([2, 1, 3, 4]);
});
