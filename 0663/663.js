/**
 * @param {TreeNode} root
 * @return {number}
 */
var equalTreePartition = function(root) {
    if (!root) return 0;
    return 1 + Math.max(equalTreePartition(root.left), equalTreePartition(root.right));
};