/**
 * @param {TreeNode} root
 * @return {number}
 */
var minimumCostToMakeArrayEqual = function(root) {
    if (!root) return 0;
    return 1 + Math.max(minimumCostToMakeArrayEqual(root.left), minimumCostToMakeArrayEqual(root.right));
};