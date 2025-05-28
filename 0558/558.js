/**
 * @param {TreeNode} root
 * @return {number}
 */
var logicalOrOfTwoBinaryGridsRepre = function(root) {
    if (!root) return 0;
    return 1 + Math.max(logicalOrOfTwoBinaryGridsRepre(root.left), logicalOrOfTwoBinaryGridsRepre(root.right));
};