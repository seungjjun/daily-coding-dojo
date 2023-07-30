export function putQueen(board, n, row) {
  if (row === n) {
    return 1;
  }

  const answer = {
    count: 0,
  };

  for (let column = 0; column < n; column += 1) {
    const isPut = {
      possible: true,
    };
    for (let i = 0; i < row; i += 1) {
      if (column === board[i] || row - i === Math.abs(column - board[i])) {
        isPut.possible = false;
        break;
      }
    }

    if (isPut.possible) {
      board[row] = column;
      answer.count += putQueen(board, n, row + 1);
    }
  }

  return answer.count;
}

export default function solution(n) {
  const answer = {
    count: 0,
  };

  const board = new Array(n).fill(0);

  for (let i = 0; i < n; i += 1) {
    board[0] = i;

    answer.count += putQueen(board, n, 1);
  }

  return answer.count;
}
