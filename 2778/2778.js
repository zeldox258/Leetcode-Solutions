/**
 * @param {TreeNode} root
 * @return {number}
 */
var sumOfSquaresOfSpecialElements = function(root) {
    if (!root) return 0;
    return 1 + Math.max(sumOfSquaresOfSpecialElements(root.left), sumOfSquaresOfSpecialElements(root.right));
};