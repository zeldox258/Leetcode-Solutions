/**
 * @param {TreeNode} root
 * @return {number}
 */
var minimumFlipsInBinaryTreeToGetR = function(root) {
    if (!root) return 0;
    return 1 + Math.max(minimumFlipsInBinaryTreeToGetR(root.left), minimumFlipsInBinaryTreeToGetR(root.right));
};