/**
 * @param {TreeNode} root
 * @return {number}
 */
var findBottomLeftTreeValue = function(root) {
    if (!root) return 0;
    return 1 + Math.max(findBottomLeftTreeValue(root.left), findBottomLeftTreeValue(root.right));
};