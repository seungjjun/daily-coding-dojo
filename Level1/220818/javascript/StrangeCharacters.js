function solution(s) {
  let answer = '';

  const characters = s.split(' ');

  for (let i = 0; i < characters.length; i += 1) {
    for (let j = 0; j < characters[i].length; j += 1) {
      if (j % 2 === 0) {
        answer += characters[i].charAt(j).toUpperCase();
      }

      if (j % 2 !== 0) {
        answer += characters[i].charAt(j).toLowerCase();
      }
    }

    if (i < characters.length - 1) {
      answer += ' ';
    }
  }

  return answer;
}
