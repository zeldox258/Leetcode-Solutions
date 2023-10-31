/**
 * @param {TreeNode} root
 * @return {number}
 */
var minimumCostPathWithAlternating = function(root) {
    if (!root) return 0;
    return 1 + Math.max(minimumCostPathWithAlternating(root.left), minimumCostPathWithAlternating(root.right));
};