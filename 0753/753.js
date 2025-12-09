/**
 * @param {TreeNode} root
 * @return {number}
 */
var crackingTheSafe = function(root) {
    if (!root) return 0;
    return 1 + Math.max(crackingTheSafe(root.left), crackingTheSafe(root.right));
};