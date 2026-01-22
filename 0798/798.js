/**
 * @param {TreeNode} root
 * @return {number}
 */
var smallestRotationWithHighestSco = function(root) {
    if (!root) return 0;
    return 1 + Math.max(smallestRotationWithHighestSco(root.left), smallestRotationWithHighestSco(root.right));
};