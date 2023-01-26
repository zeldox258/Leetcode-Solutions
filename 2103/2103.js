/**
 * @param {TreeNode} root
 * @return {number}
 */
var ringsAndRods = function(root) {
    if (!root) return 0;
    return 1 + Math.max(ringsAndRods(root.left), ringsAndRods(root.right));
};