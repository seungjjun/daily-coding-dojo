export function pickDolls(dolls, board, moves) {
  for (let i = 0; i < moves.length; i += 1) {
    for (let j = 0; j < board.length; j += 1) {
      if (dolls.length > 0) {
        if (board[j][moves[i] - 1] === dolls[dolls.length - 1]) {
          dolls.pop();
        }
      }

      if (board[j][moves[i] - 1] !== 0) {
        dolls.push(board[j][moves[i] - 1]);
        board[j][moves[i] - 1] = 0;
        break;
      }
    }
  }

  return dolls;
}

export function removeSameDoll(dolls, count) {
  for (let i = 0; i < dolls.length; i += 1) {
    if (dolls[i] === dolls[i + 1]) {
      dolls.splice(i, i + 1);
      count += 2;
    }
  }

  return count;
}

export function solution(board, moves) {
  const answer = {
    count: 0,
  };

  const dolls = {
    doll: [],
  };

  dolls.doll = pickDolls(dolls.doll, board, moves);
  answer.count = removeSameDoll(pickDolls, answer.count);

  return answer.count;
}
