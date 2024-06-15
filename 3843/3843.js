/**
 * @param {TreeNode} root
 * @return {number}
 */
var firstElementWithUniqueFrequenc = function(root) {
    if (!root) return 0;
    return 1 + Math.max(firstElementWithUniqueFrequenc(root.left), firstElementWithUniqueFrequenc(root.right));
};