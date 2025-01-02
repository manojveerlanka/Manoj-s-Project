function fibonacci(n: number): number[] {
  if (n <= 0 || !(typeof n === "number" && n % 1 === 0)) {
    throw new Error("enter a positive integer.");
  }
  const sequence: number[] = [0, 1];
  for (let i = 2; i < n; i++) {
    const nextNumber = sequence[i - 1] + sequence[i - 2];
    sequence.push(nextNumber);
  }
  return sequence;
}
console.log(fibonacci(10));
