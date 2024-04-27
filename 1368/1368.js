/**
 * @param {TreeNode} root
 * @return {number}
 */
var minimumCostToMakeAtLeastOneVal = function(root) {
    if (!root) return 0;
    return 1 + Math.max(minimumCostToMakeAtLeastOneVal(root.left), minimumCostToMakeAtLeastOneVal(root.right));
};