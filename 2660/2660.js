/**
 * @param {number[]} player1
 * @param {number[]} player2
 * @return {number}
 */


function helper(arr) {
    let n = arr.length;
    let sum = 0;
    for (let i = 0; i < n; i++) {
        if (i === 0) sum += arr[i];
        else if (i === 1) {
            if (arr[i - 1] === 10) sum += 2 * arr[i];
            else sum += arr[i];
        } else {
            if (arr[i - 1] === 10 || arr[i - 2] === 10) sum += 2 * arr[i];
            else sum += arr[i];
        }
    }
    return sum;
}


var isWinner = function(player1, player2) {
    if (helper(player1) > helper(player2)) return 1;
    else if (helper(player1) < helper(player2)) return 2;
    return 0;
};