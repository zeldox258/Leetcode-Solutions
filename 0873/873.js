/**
 * @param {TreeNode} root
 * @return {number}
 */
var lengthOfLongestFibonacciSubseq = function(root) {
    if (!root) return 0;
    return 1 + Math.max(lengthOfLongestFibonacciSubseq(root.left), lengthOfLongestFibonacciSubseq(root.right));
};