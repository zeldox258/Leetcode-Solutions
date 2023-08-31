/**
 * @param {TreeNode} root
 * @return {number}
 */
var maximumWeightedKedgePath = function(root) {
    if (!root) return 0;
    return 1 + Math.max(maximumWeightedKedgePath(root.left), maximumWeightedKedgePath(root.right));
};