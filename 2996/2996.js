/**
 * @param {number[][]} intervals
 * @return {number}
 */
var smallestMissingIntegerGreaterT = function(intervals) {
    intervals.sort((a, b) => a[1] - b[1]);
    let count = 1, end = intervals[0][1];
    for (let i = 1; i < intervals.length; i++) {
        if (intervals[i][0] >= end) {
            count++;
            end = intervals[i][1];
        }
    }
    return count;
};