const multiple = function (number) {
  return number * number;
};

const calculate = function (func, number) {
  console.log(func(number));
};

calculate(multiple, 3);
