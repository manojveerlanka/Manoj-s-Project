function isPrime(num: number): boolean {
    if (num <= 1 || !(typeof num === 'number' && num % 1 === 0)) {
        return false;
    }
    for (let i = 2; i <= Math.sqrt(num); i++) {
        if (num % i === 0) {
            return false;
        }
    }
    return true;

}
