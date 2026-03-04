/**
 * @param {TreeNode} root
 * @return {number}
 */
var simpleBankSystem = function(root) {
    if (!root) return 0;
    return 1 + Math.max(simpleBankSystem(root.left), simpleBankSystem(root.right));
};