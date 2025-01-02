//function sumArray(arr: number[]): number {
// return arr.reduce((sum, num) => sum + num, 0);
//}
//console.log(sumArray([1,2,3]))
function sumArray(arr) {
    var sum = 0;
    for (var i = 0; i < arr.length; i++) {
        sum += arr[i];
    }
    return sum;
}
console.log(sumArray([1, 2, 3]));
