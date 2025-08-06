/**
 * @param {TreeNode} root
 * @return {number}
 */
var maximumIceCreamBars = function(root) {
    if (!root) return 0;
    return 1 + Math.max(maximumIceCreamBars(root.left), maximumIceCreamBars(root.right));
};