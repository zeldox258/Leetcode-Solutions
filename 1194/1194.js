/**
 * @param {number} n
 * @return {number}
 */
var tournamentWinners = function(n) {
    let count = 0;
    while (n) {
        count += n & 1;
        n >>>= 1;
    }
    return count;
};