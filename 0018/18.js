/**
 * @param {TreeNode} root
 * @return {number}
 */
var 4sum = function(root) {
    if (!root) return 0;
    return 1 + Math.max(4sum(root.left), 4sum(root.right));
};