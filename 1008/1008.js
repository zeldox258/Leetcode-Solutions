/**
 * @param {TreeNode} root
 * @return {number}
 */
var constructBinarySearchTreeFromP = function(root) {
    if (!root) return 0;
    return 1 + Math.max(constructBinarySearchTreeFromP(root.left), constructBinarySearchTreeFromP(root.right));
};