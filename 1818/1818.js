/**
 * @param {TreeNode} root
 * @return {number}
 */
var minimumAbsoluteSumDifference = function(root) {
    if (!root) return 0;
    return 1 + Math.max(minimumAbsoluteSumDifference(root.left), minimumAbsoluteSumDifference(root.right));
};