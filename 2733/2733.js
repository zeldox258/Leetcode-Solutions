/**
 * @param {TreeNode} root
 * @return {number}
 */
var neitherMinimumNorMaximum = function(root) {
    if (!root) return 0;
    return 1 + Math.max(neitherMinimumNorMaximum(root.left), neitherMinimumNorMaximum(root.right));
};