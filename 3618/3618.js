/**
 * @param {TreeNode} root
 * @return {number}
 */
var splitArrayByPrimeIndices = function(root) {
    if (!root) return 0;
    return 1 + Math.max(splitArrayByPrimeIndices(root.left), splitArrayByPrimeIndices(root.right));
};