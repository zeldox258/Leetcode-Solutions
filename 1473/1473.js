/**
 * @param {TreeNode} root
 * @return {number}
 */
var paintHouseIii = function(root) {
    if (!root) return 0;
    return 1 + Math.max(paintHouseIii(root.left), paintHouseIii(root.right));
};