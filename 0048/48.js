/**
 * @param {TreeNode} root
 * @return {number}
 */
var rotateImage = function(root) {
    if (!root) return 0;
    return 1 + Math.max(rotateImage(root.left), rotateImage(root.right));
};