export function solution(answers) {
  const answer = [];

  const firstCount = {
    count: 0,
  };

  const secoundCount = {
    count: 0,
  };

  const thirdCount = {
    count: 0,
  };

  firstCount.count = firstCountCompute(firstCount.count, answers);
  secoundCount.count = secoundCountCompute(secoundCount.count, answers);
  thirdCount.count = thirdCountCompute(thirdCount.count, answers);

  const maximumCount = Math.max(firstCount.count, secoundCount.count, thirdCount.count);

  if (firstCount.count === maximumCount) {
    answer.push(1);
  }

  if (secoundCount.count === maximumCount) {
    answer.push(2);
  }

  if (thirdCount.count === maximumCount) {
    answer.push(3);
  }

  return answer;
}

export function firstCountCompute(count, answers) {
  const firstAnswers = [1, 2, 3, 4, 5];

  for (let i = 0; i < answers.length; i += 1) {
    if (firstAnswers[i % 5] === answers[i]) {
      count += 1;
    }
  }
  return count;
}

export function secoundCountCompute(count, answers) {
  const secondAnswers = [2, 1, 2, 3, 2, 4, 2, 5];

  for (let i = 0; i < answers.length; i += 1) {
    if (secondAnswers[i % 8] === answers[i]) {
      count += 1;
    }
  }
  return count;
}

export function thirdCountCompute(count, answers) {
  const thirdAnswers = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5];
  for (let i = 0; i < answers.length; i += 1) {
    if (thirdAnswers[i % 10] === answers[i]) {
      count += 1;
    }
  }
  return count;
}
