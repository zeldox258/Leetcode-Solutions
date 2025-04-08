/**
 * @param {TreeNode} root
 * @return {number}
 */
var minimumOperationsToMakeASubseq = function(root) {
    if (!root) return 0;
    return 1 + Math.max(minimumOperationsToMakeASubseq(root.left), minimumOperationsToMakeASubseq(root.right));
};