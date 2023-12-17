/**
 * @param {TreeNode} root
 * @return {number}
 */
var earliestFinishTimeForLandAndWa = function(root) {
    if (!root) return 0;
    return 1 + Math.max(earliestFinishTimeForLandAndWa(root.left), earliestFinishTimeForLandAndWa(root.right));
};