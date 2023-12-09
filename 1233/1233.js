/**
 * @param {TreeNode} root
 * @return {number}
 */
var removeSubfoldersFromTheFilesys = function(root) {
    if (!root) return 0;
    return 1 + Math.max(removeSubfoldersFromTheFilesys(root.left), removeSubfoldersFromTheFilesys(root.right));
};