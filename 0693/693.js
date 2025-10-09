/**
 * @param {TreeNode} root
 * @return {number}
 */
var binaryNumberWithAlternatingBit = function(root) {
    if (!root) return 0;
    return 1 + Math.max(binaryNumberWithAlternatingBit(root.left), binaryNumberWithAlternatingBit(root.right));
};