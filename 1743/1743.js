/**
 * @param {TreeNode} root
 * @return {number}
 */
var restoreTheArrayFromAdjacentPai = function(root) {
    if (!root) return 0;
    return 1 + Math.max(restoreTheArrayFromAdjacentPai(root.left), restoreTheArrayFromAdjacentPai(root.right));
};