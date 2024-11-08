/**
 * @param {TreeNode} root
 * @return {number}
 */
var stoneGameV = function(root) {
    if (!root) return 0;
    return 1 + Math.max(stoneGameV(root.left), stoneGameV(root.right));
};