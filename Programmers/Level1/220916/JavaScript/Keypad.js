export default function solution(numbers, hand) {
  const answer = {
    location: '',
  };

  const Keypad = [[1, 3],
    [0, 0], [1, 0], [2, 0],
    [0, 1], [1, 1], [2, 1],
    [0, 2], [1, 2], [2, 2]];

  const leftHand = {
    location: [0, 3],
  };
  const rightHand = {
    location: [2, 3],
  };

  answer.location = numbers.map((number) => {
    if (number === 3 || number === 6 || number === 9) {
      rightHand.location = [...Keypad[number]];
      return 'R';
    }

    if (number === 1 || number === 4 || number === 7) {
      leftHand.location = [...Keypad[number]];
      return 'L';
    }

    if (number === 2 || number === 5 || number === 8 || number === 0) {
      const previousLeftHandLocation = Math.abs(Keypad[number][0] - leftHand.location[0])
        + Math.abs(Keypad[number][1] - leftHand.location[1]);

      const previousRightHandLocation = Math.abs(Keypad[number][0] - rightHand.location[0])
      + Math.abs(Keypad[number][1] - rightHand.location[1]);

      if (previousLeftHandLocation < previousRightHandLocation) {
        leftHand.location = Keypad[number];
        return 'L';
      }

      if (previousLeftHandLocation > previousRightHandLocation) {
        rightHand.location = Keypad[number];
        return 'R';
      }

      if (previousLeftHandLocation === previousRightHandLocation) {
        if (hand === 'right') {
          rightHand.location = Keypad[number];
          return 'R';
        }

        if (hand === 'left') {
          leftHand.location = Keypad[number];
          return 'L';
        }
      }
    }
  }).join('');

  return answer.location;
}

/*
const answer = {
    location: '',
  };

  const leftHand = {
    location: '10',
  };

  const rightHand = {
    location: '12',
  };

  numbers.forEach((number) => {
    if (number === 3 || number === 6 || number === 9) {
      answer.location += 'R';
      rightHand.location = number;
    }

    if (number === 1 || number === 4 || number === 7) {
      answer.location += 'L';
      leftHand.location = number;
    }

    if (number === 2 || number === 5 || number === 8 || number === 0) {
      if (number === 0) {
        number += 11;
      }

      leftHand.location = (Math.abs(number - leftHand.location) / 3
      + Math.abs(number - leftHand.location) % 3);

      rightHand.location = (Math.abs(number - rightHand.location) / 3
       + Math.abs(number - rightHand.location) % 3);

      if (leftHand.location === rightHand.location) {
        if (hand === 'right') {
          answer.location += 'R';
          rightHand.location = number;
          return;
        }

        if (hand === 'left') {
          answer.location += 'L';
          leftHand.location = number;
          return;
        }

        if (number === 0) {
          if (hand === 'right') {
            answer.location += 'R';
            rightHand.location = number;
            return;
          }

          if (hand === 'left') {
            answer.location += 'L';
            leftHand.location = number;
            return;
          }
        }
      }

      if (leftHand.location > rightHand.location) {
        answer.location += 'R';
        rightHand.location = number;
        return;
      }

      if (leftHand.location < rightHand.location) {
        answer.location += 'L';
        leftHand.location = number;
      }
    }
  });

  return answer.location;
  */
