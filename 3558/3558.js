/**
 * @param {TreeNode} root
 * @return {number}
 */
var numberOfWaysToAssignEdgeWeight = function(root) {
    if (!root) return 0;
    return 1 + Math.max(numberOfWaysToAssignEdgeWeight(root.left), numberOfWaysToAssignEdgeWeight(root.right));
};