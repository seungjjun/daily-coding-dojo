// eslint-disable-next-line import/prefer-default-export
export function solution(array, commands) {
  const answer = [commands.length];

  for (let i = 0; i < commands.length; i += 1) {
    const startIndex = commands[i][0];
    const endIndex = commands[i][1];

    const slicingArray = array.slice(startIndex - 1, endIndex);
    slicingArray.sort((a, b) => a - b);

    answer[i] = slicingArray[commands[i][2] - 1];
  }

  return answer;
}
