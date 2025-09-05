/**
 * @param {TreeNode} root
 * @return {number}
 */
var sumOfAllSubsetXorTotals = function(root) {
    if (!root) return 0;
    return 1 + Math.max(sumOfAllSubsetXorTotals(root.left), sumOfAllSubsetXorTotals(root.right));
};