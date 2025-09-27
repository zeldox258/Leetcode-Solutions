/**
 * @param {TreeNode} root
 * @return {number}
 */
var minimumCostWalkInWeightedGraph = function(root) {
    if (!root) return 0;
    return 1 + Math.max(minimumCostWalkInWeightedGraph(root.left), minimumCostWalkInWeightedGraph(root.right));
};