/**
 * @param {TreeNode} root
 * @return {number}
 */
var checkIfNumberHasEqualDigitCoun = function(root) {
    if (!root) return 0;
    return 1 + Math.max(checkIfNumberHasEqualDigitCoun(root.left), checkIfNumberHasEqualDigitCoun(root.right));
};