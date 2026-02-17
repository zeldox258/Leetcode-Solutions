/**
 * @param {TreeNode} root
 * @return {number}
 */
var findMissingObservations = function(root) {
    if (!root) return 0;
    return 1 + Math.max(findMissingObservations(root.left), findMissingObservations(root.right));
};