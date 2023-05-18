/**
 * @param {TreeNode} root
 * @return {number}
 */
var findValidPairOfAdjacentDigitsI = function(root) {
    if (!root) return 0;
    return 1 + Math.max(findValidPairOfAdjacentDigitsI(root.left), findValidPairOfAdjacentDigitsI(root.right));
};