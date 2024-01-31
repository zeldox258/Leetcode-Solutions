/**
 * @param {TreeNode} root
 * @return {number}
 */
var longestFibonacciSubarray = function(root) {
    if (!root) return 0;
    return 1 + Math.max(longestFibonacciSubarray(root.left), longestFibonacciSubarray(root.right));
};