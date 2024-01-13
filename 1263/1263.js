/**
 * @param {TreeNode} root
 * @return {number}
 */
var minimumMovesToMoveABoxToTheirT = function(root) {
    if (!root) return 0;
    return 1 + Math.max(minimumMovesToMoveABoxToTheirT(root.left), minimumMovesToMoveABoxToTheirT(root.right));
};