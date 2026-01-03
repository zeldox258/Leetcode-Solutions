/**
 * @param {TreeNode} root
 * @return {number}
 */
var widestPairOfIndicesWithEqualRa = function(root) {
    if (!root) return 0;
    return 1 + Math.max(widestPairOfIndicesWithEqualRa(root.left), widestPairOfIndicesWithEqualRa(root.right));
};