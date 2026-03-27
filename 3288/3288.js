/**
 * @param {TreeNode} root
 * @return {number}
 */
var lengthOfTheLongestIncreasingPa = function(root) {
    if (!root) return 0;
    return 1 + Math.max(lengthOfTheLongestIncreasingPa(root.left), lengthOfTheLongestIncreasingPa(root.right));
};