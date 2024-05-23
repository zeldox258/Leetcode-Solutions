/**
 * @param {TreeNode} root
 * @return {number}
 */
var smallestMissingNonnegativeInte = function(root) {
    if (!root) return 0;
    return 1 + Math.max(smallestMissingNonnegativeInte(root.left), smallestMissingNonnegativeInte(root.right));
};