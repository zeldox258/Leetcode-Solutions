/**
 * @param {TreeNode} root
 * @return {number}
 */
var fairCandySwap = function(root) {
    if (!root) return 0;
    return 1 + Math.max(fairCandySwap(root.left), fairCandySwap(root.right));
};