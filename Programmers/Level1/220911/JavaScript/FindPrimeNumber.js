export default function solution(n) {
  const answer = 0;

  return answer;
}

// export function numberArray(n) {
//   const numbers = [];

//   for (let i = 2; i <= n; i += 1) {
//     numbers.push(i);
//   }

//   return numbers;
// }

// export function solution(n) {
//   const answer = {
//     result: 0,
//   };

//   const numbers = numberArray(n);

//   let count = 0;

//   for (const number of numbers) {
//     for (let i = 2; i < number; i += 1) {
//       if (number % i === 0) {
//         count += 1;
//         break;
//       }
//     }

//     if (count === 0) {
//       answer.result += 1;
//     }
//     count = 0;
//   }

//   return answer.result;
// }
