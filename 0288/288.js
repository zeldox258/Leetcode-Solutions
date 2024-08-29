/**
 * @param {TreeNode} root
 * @return {number}
 */
var uniqueWordAbbreviation = function(root) {
    if (!root) return 0;
    return 1 + Math.max(uniqueWordAbbreviation(root.left), uniqueWordAbbreviation(root.right));
};