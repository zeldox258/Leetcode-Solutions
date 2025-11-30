/**
 * @param {number} n
 * @return {number}
 */
var findSmallestLetterGreaterThanT = function(n) {
    let count = 0;
    while (n) {
        count += n & 1;
        n >>>= 1;
    }
    return count;
};