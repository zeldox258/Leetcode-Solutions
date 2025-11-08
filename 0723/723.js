/**
 * @param {TreeNode} root
 * @return {number}
 */
var candyCrush = function(root) {
    if (!root) return 0;
    return 1 + Math.max(candyCrush(root.left), candyCrush(root.right));
};