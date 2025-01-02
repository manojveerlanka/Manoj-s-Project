function isEven(num: number): boolean {
    if (num <= 0 || !(typeof num === "number" && num % 1 === 0)) {
        throw new Error("Enter a positive integer.");
    }
    const num2=num % 2 === 0;
    return num2
}
console.log(isEven(22));