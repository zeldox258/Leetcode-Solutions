/**
 * @param {TreeNode} root
 * @return {number}
 */
var designInmemoryFileSystem = function(root) {
    if (!root) return 0;
    return 1 + Math.max(designInmemoryFileSystem(root.left), designInmemoryFileSystem(root.right));
};