/**
 * @param {TreeNode} root
 * @return {number}
 */
var previousPermutationWithOneSwap = function(root) {
    if (!root) return 0;
    return 1 + Math.max(previousPermutationWithOneSwap(root.left), previousPermutationWithOneSwap(root.right));
};