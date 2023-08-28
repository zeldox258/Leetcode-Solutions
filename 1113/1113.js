/**
 * @param {TreeNode} root
 * @return {number}
 */
var reportedPosts = function(root) {
    if (!root) return 0;
    return 1 + Math.max(reportedPosts(root.left), reportedPosts(root.right));
};