function isEven(num) {
    if (num <= 0 || !(typeof num === "number" && num % 1 === 0)) {
        throw new Error("Enter a positive integer.");
    }
    var num2 = num % 2 === 0;
    return num2;
}
console.log(isEven(22));
