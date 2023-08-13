/**
 * @param {TreeNode} root
 * @return {number}
 */
var unpopularBooks = function(root) {
    if (!root) return 0;
    return 1 + Math.max(unpopularBooks(root.left), unpopularBooks(root.right));
};