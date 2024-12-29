/**
 * @param {TreeNode} root
 * @return {number}
 */
var validWordAbbreviation = function(root) {
    if (!root) return 0;
    return 1 + Math.max(validWordAbbreviation(root.left), validWordAbbreviation(root.right));
};