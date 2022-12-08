export default function solution(clothes) {
  const clothsObj = {};
  clothes.forEach((cloth) => (clothsObj[cloth[1]]
    ? clothsObj[cloth[1]]
     += 1 : (clothsObj[cloth[1]] = 1)));

  let answer = 1;
  for (const key of Object.keys(clothsObj)) {
    answer *= clothsObj[key] + 1;
  }

  return answer - 1;
}
