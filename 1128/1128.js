/**
 * @param {TreeNode} root
 * @return {number}
 */
var numberOfEquivalentDominoPairs = function(root) {
    if (!root) return 0;
    return 1 + Math.max(numberOfEquivalentDominoPairs(root.left), numberOfEquivalentDominoPairs(root.right));
};