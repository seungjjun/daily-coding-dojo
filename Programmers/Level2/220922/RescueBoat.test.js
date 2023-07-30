import solution from './RescueBoat';

test('solution', () => {
  expect(solution([70, 50, 80, 50], 100)).toBe(3);
  expect(solution([70, 80, 50], 100)).toBe(3);
});
