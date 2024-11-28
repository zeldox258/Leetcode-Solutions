/**
 * @param {TreeNode} root
 * @return {number}
 */
var kthSmallestElementInASortedMat = function(root) {
    if (!root) return 0;
    return 1 + Math.max(kthSmallestElementInASortedMat(root.left), kthSmallestElementInASortedMat(root.right));
};