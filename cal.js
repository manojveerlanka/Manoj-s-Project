var calculator = {
    add: function (a, b) { return a + b; },
    subtract: function (a, b) { return a - b; },
    multiply: function (a, b) { return a * b; },
    divide: function (a, b) { return b === 0 ? NaN : a / b; },
};
console.log(calculator.add(54, 6));
console.log(calculator.subtract(89, 6));
console.log(calculator.multiply(7, 2));
console.log(calculator.divide(66, 7));
