/**
 * @param {TreeNode} root
 * @return {number}
 */
var buildTheEquation = function(root) {
    if (!root) return 0;
    return 1 + Math.max(buildTheEquation(root.left), buildTheEquation(root.right));
};