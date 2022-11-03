export function toArray(s) {
  return s.split('');
}

export function remove(words) {
  const stack = [];

  words.map((word) => {
    if (stack.length === 0 || stack[stack.length - 1] !== word) {
      stack.push(word);
      return;
    }
    if (stack[stack.length - 1] === word) {
      stack.pop();
    }
  });

  return stack;
}

export function solution(s) {
  const words = toArray(s);

  const stackArray = remove(words);

  return stackArray.length === 0 ? 1 : 0;
}
