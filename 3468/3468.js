/**
 * @param {TreeNode} root
 * @return {number}
 */
var findTheNumberOfCopyArrays = function(root) {
    if (!root) return 0;
    return 1 + Math.max(findTheNumberOfCopyArrays(root.left), findTheNumberOfCopyArrays(root.right));
};