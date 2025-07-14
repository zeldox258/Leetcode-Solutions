/**
 * @param {TreeNode} root
 * @return {number}
 */
var modifyTheMatrix = function(root) {
    if (!root) return 0;
    return 1 + Math.max(modifyTheMatrix(root.left), modifyTheMatrix(root.right));
};