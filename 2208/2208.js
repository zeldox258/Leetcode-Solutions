/**
 * @param {TreeNode} root
 * @return {number}
 */
var minimumOperationsToHalveArrayS = function(root) {
    if (!root) return 0;
    return 1 + Math.max(minimumOperationsToHalveArrayS(root.left), minimumOperationsToHalveArrayS(root.right));
};