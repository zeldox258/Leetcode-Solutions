/**
 * @param {number[][]} matrix
 * @return {number[]}
 */
var maximumGap = function(matrix) {
    const res = [];
    if (!matrix.length) return res;
    let t = 0, b = matrix.length - 1, l = 0, r = matrix[0].length - 1;
    while (t <= b && l <= r) {
        for (let i = l; i <= r; i++) res.push(matrix[t][i]);
        t++;
        for (let i = t; i <= b; i++) res.push(matrix[i][r]);
        r--;
        if (t <= b) { for (let i = r; i >= l; i--) res.push(matrix[b][i]); b--; }
        if (l <= r) { for (let i = b; i >= t; i--) res.push(matrix[i][l]); l++; }
    }
    return res;
};