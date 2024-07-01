/**
 * @param {TreeNode} root
 * @return {number}
 */
var rowWithMaximumOnes = function(root) {
    if (!root) return 0;
    return 1 + Math.max(rowWithMaximumOnes(root.left), rowWithMaximumOnes(root.right));
};