// eslint-disable-next-line import/prefer-default-export
export function solution(participant, completion) {
  let answer = '';

  const hashMap = new Map();

  participant.map((e) => {
    hashMap.set(e, hashMap.get(e) + 1 || 1);
  });

  completion.map((e) => {
    hashMap.set(e, hashMap.get(e) - 1 || 0);
  });

  // eslint-disable-next-line no-restricted-syntax
  for (const [key, value] of hashMap) {
    if (value >= 1) {
      answer = key;
    }
  }

  return answer;
}

/*
let answer = '';

  participant.sort();
  completion.sort();

  answer = participant[participant.length - 1];
  for (let i = 0; i < completion.length; i += 1) {
    if (participant[i] !== completion[i]) {
      answer = participant[i];
      break;
    }
  }

  return answer;
*/
