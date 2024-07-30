/**
 * @param {TreeNode} root
 * @return {number}
 */
var minimumOperationsToMakeAllGrid = function(root) {
    if (!root) return 0;
    return 1 + Math.max(minimumOperationsToMakeAllGrid(root.left), minimumOperationsToMakeAllGrid(root.right));
};