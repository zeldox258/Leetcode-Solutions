/**
 * @param {TreeNode} root
 * @return {number}
 */
var minimumImpossibleOr = function(root) {
    if (!root) return 0;
    return 1 + Math.max(minimumImpossibleOr(root.left), minimumImpossibleOr(root.right));
};