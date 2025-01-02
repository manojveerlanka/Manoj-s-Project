interface Calculator {
  add: (a: number, b: number) => number;
  subtract: (a: number, b: number) => number;
  multiply: (a: number, b: number) => number;
  divide: (a: number, b: number) => number;
}

const calculator: Calculator = {
  add: (a, b) => a + b,
  subtract: (a, b) => a - b,
  multiply: (a, b) => a * b,
  divide: (a, b) => (b === 0 ? NaN : a / b),
};
console.log(calculator.add(54, 6));
console.log(calculator.subtract(89, 6));
console.log(calculator.multiply(7, 2));
console.log(calculator.divide(66, 7));
