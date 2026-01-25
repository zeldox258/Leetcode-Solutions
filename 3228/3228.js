/**
 * @param {TreeNode} root
 * @return {number}
 */
var maximumNumberOfOperationsToMov = function(root) {
    if (!root) return 0;
    return 1 + Math.max(maximumNumberOfOperationsToMov(root.left), maximumNumberOfOperationsToMov(root.right));
};