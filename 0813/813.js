/**
 * @param {TreeNode} root
 * @return {number}
 */
var largestSumOfAverages = function(root) {
    if (!root) return 0;
    return 1 + Math.max(largestSumOfAverages(root.left), largestSumOfAverages(root.right));
};