/**
 * @param {TreeNode} root
 * @return {number}
 */
var dropMissingData = function(root) {
    if (!root) return 0;
    return 1 + Math.max(dropMissingData(root.left), dropMissingData(root.right));
};