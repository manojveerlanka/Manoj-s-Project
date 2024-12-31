function fibonacci(n) {
    if (n <= 0 || !(typeof n === 'number' && n % 1 === 0)) {
        throw new Error("Input must be a positive integer.");
    }
    var sequence = [0, 1];
    for (var i = 2; i < n; i++) {
        var nextNumber = sequence[i - 1] + sequence[i - 2];
        sequence.push(nextNumber);
    }
    return sequence;
}
console.log(fibonacci(10));
