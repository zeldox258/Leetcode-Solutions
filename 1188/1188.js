/**
 * @param {TreeNode} root
 * @return {number}
 */
var designBoundedBlockingQueue = function(root) {
    if (!root) return 0;
    return 1 + Math.max(designBoundedBlockingQueue(root.left), designBoundedBlockingQueue(root.right));
};