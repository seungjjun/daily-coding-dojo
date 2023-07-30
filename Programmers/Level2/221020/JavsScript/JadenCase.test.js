import {
  convertToLowerCase, firstWordToUpperCase, solution, toArray,
} from './JadenCase';

test('toLowerCase', () => {
  expect(convertToLowerCase('FoR The lASt weEK')).toBe('for the last week');
});

test('toArray', () => {
  expect(toArray('for the ')).toStrictEqual(['f', 'o', 'r', ' ', 't', 'h', 'e', ' ']);
  expect(toArray(' 3people  Un '))

    .toStrictEqual([' ', '3', 'p', 'e', 'o', 'p', 'l', 'e', ' ', ' ', 'U', 'n', ' ']);
});

test('firstWordToUpperCase', () => {
  expect(firstWordToUpperCase(['f', 'o', 'r', ' ', 't', 'h', 'e', ' ']))
    .toBe('For The ');
});

test('solution', () => {
  expect(solution('for the last week')).toBe('For The Last Week');
  expect(solution('for  the  last  week ')).toBe('For  The  Last  Week ');
});
