/**
 * @param {TreeNode} root
 * @return {number}
 */
var minimumNumberOfMovesToMakePali = function(root) {
    if (!root) return 0;
    return 1 + Math.max(minimumNumberOfMovesToMakePali(root.left), minimumNumberOfMovesToMakePali(root.right));
};