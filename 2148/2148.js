/**
 * @param {TreeNode} root
 * @return {number}
 */
var countElementsWithStrictlySmall = function(root) {
    if (!root) return 0;
    return 1 + Math.max(countElementsWithStrictlySmall(root.left), countElementsWithStrictlySmall(root.right));
};