/**
 * @param {TreeNode} root
 * @return {number}
 */
var designTictactoe = function(root) {
    if (!root) return 0;
    return 1 + Math.max(designTictactoe(root.left), designTictactoe(root.right));
};