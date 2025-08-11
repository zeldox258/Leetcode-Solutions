/**
 * @param {TreeNode} root
 * @return {number}
 */
var sumOfSquareNumbers = function(root) {
    if (!root) return 0;
    return 1 + Math.max(sumOfSquareNumbers(root.left), sumOfSquareNumbers(root.right));
};