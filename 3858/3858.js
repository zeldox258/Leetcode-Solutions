/**
 * @param {TreeNode} root
 * @return {number}
 */
var minimumBitwiseOrFromGrid = function(root) {
    if (!root) return 0;
    return 1 + Math.max(minimumBitwiseOrFromGrid(root.left), minimumBitwiseOrFromGrid(root.right));
};