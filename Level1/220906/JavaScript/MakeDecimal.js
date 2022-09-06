export function sum(nums) {
  const sums = [];

  for (let i = 0; i < nums.length - 2; i += 1) {
    for (let j = 1; j < nums.length - 1; j += 1) {
      for (let k = 2; k < nums.length; k += 1) {
        if (i !== j && j !== k && i !== k && i < j && j < k) {
          sums.push(nums[i] + nums[j] + nums[k]);
        }
      }
    }
  }

  return sums;
}

export function decimals(sums) {
  const decimalCount = {
    count: 0,
  };

  const decimals = [];

  for (let i = 0; i < sums.length; i += 1) {
    for (let j = 2; j < sums[i]; j += 1) {
      if (sums[i] % j === 0) {
        decimalCount.count += 1;
        break;
      }
    }

    if (decimalCount.count === 0) {
      decimals.push(sums[i]);
    }

    decimalCount.count = 0;
  }

  return decimals;
}

export function solution(nums) {
  const sums = sum(nums);
  const decimal = decimals(sums);

  return decimal.length;
}
