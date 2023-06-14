/**
 * @param {TreeNode} root
 * @return {number}
 */
var binarySearchTreeToGreaterSumTr = function(root) {
    if (!root) return 0;
    return 1 + Math.max(binarySearchTreeToGreaterSumTr(root.left), binarySearchTreeToGreaterSumTr(root.right));
};