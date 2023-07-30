export function highestNumber(lottos, win_nums) {
  const rightNumber = lottos.filter((number) => (
    win_nums.includes(number)
  ));

  const highestRank = {
    number: rightNumber.length,
  };

  lottos.forEach((number) => {
    if (number === 0) {
      highestRank.number += 1;
    }
  });

  return highestRank.number;
}

export function lowestNumber(lottos, win_nums) {
  const rightNumber = lottos.filter((number) => (
    win_nums.includes(number)
  ));

  return rightNumber.length;
}

export function lottoResult(highestRankNumber, lowestRankNumber) {
  const highestNumber = {
    rank: 7 - highestRankNumber,
  };

  if (highestRankNumber === 0) {
    highestNumber.rank = 6;
  }

  const lowestNumber = {
    rank: 7 - lowestRankNumber,
  };

  if (lowestRankNumber === 0) {
    lowestNumber.rank = 6;
  }

  return [highestNumber.rank, lowestNumber.rank];
}

export function solution(lottos, win_nums) {
  const highestRankNumber = highestNumber(lottos, win_nums);
  const lowestRankNumber = lowestNumber(lottos, win_nums);

  const answer = lottoResult(highestRankNumber, lowestRankNumber);

  return answer;
}
