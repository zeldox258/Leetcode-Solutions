/**
 * @param {TreeNode} root
 * @return {number}
 */
var sumOfDigitDifferencesOfAllPair = function(root) {
    if (!root) return 0;
    return 1 + Math.max(sumOfDigitDifferencesOfAllPair(root.left), sumOfDigitDifferencesOfAllPair(root.right));
};