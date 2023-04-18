/**
 * @param {TreeNode} root
 * @return {number}
 */
var designTaskManager = function(root) {
    if (!root) return 0;
    return 1 + Math.max(designTaskManager(root.left), designTaskManager(root.right));
};