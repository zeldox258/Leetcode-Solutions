/**
 * @param {TreeNode} root
 * @return {number}
 */
var gameOfNim = function(root) {
    if (!root) return 0;
    return 1 + Math.max(gameOfNim(root.left), gameOfNim(root.right));
};