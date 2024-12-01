/**
 * @param {TreeNode} root
 * @return {number}
 */
var minimumSecondsToEqualizeACircu = function(root) {
    if (!root) return 0;
    return 1 + Math.max(minimumSecondsToEqualizeACircu(root.left), minimumSecondsToEqualizeACircu(root.right));
};