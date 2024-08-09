/**
 * @param {TreeNode} root
 * @return {number}
 */
var findActiveUsers = function(root) {
    if (!root) return 0;
    return 1 + Math.max(findActiveUsers(root.left), findActiveUsers(root.right));
};