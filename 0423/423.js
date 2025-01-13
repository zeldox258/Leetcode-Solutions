/**
 * @param {TreeNode} root
 * @return {number}
 */
var reconstructOriginalDigitsFromE = function(root) {
    if (!root) return 0;
    return 1 + Math.max(reconstructOriginalDigitsFromE(root.left), reconstructOriginalDigitsFromE(root.right));
};