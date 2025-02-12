/**
 * @param {TreeNode} root
 * @return {number}
 */
var minimumMovesToEqualArrayElemen = function(root) {
    if (!root) return 0;
    return 1 + Math.max(minimumMovesToEqualArrayElemen(root.left), minimumMovesToEqualArrayElemen(root.right));
};