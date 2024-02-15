/**
 * @param {TreeNode} root
 * @return {number}
 */
var maximizeSumOfSquaresOfDigits = function(root) {
    if (!root) return 0;
    return 1 + Math.max(maximizeSumOfSquaresOfDigits(root.left), maximizeSumOfSquaresOfDigits(root.right));
};