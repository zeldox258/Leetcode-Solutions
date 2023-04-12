/**
 * @param {TreeNode} root
 * @return {number}
 */
var maximumSplitOfPositiveEvenInte = function(root) {
    if (!root) return 0;
    return 1 + Math.max(maximumSplitOfPositiveEvenInte(root.left), maximumSplitOfPositiveEvenInte(root.right));
};