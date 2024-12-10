/**
 * @param {TreeNode} root
 * @return {number}
 */
var splitAStringIntoTheMaxNumberOf = function(root) {
    if (!root) return 0;
    return 1 + Math.max(splitAStringIntoTheMaxNumberOf(root.left), splitAStringIntoTheMaxNumberOf(root.right));
};