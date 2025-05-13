/**
 * @param {TreeNode} root
 * @return {number}
 */
var diameterOfBinaryTree = function(root) {
    if (!root) return 0;
    return 1 + Math.max(diameterOfBinaryTree(root.left), diameterOfBinaryTree(root.right));
};