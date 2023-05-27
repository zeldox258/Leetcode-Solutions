/**
 * @param {TreeNode} root
 * @return {number}
 */
var sumOfScoresOfBuiltStrings = function(root) {
    if (!root) return 0;
    return 1 + Math.max(sumOfScoresOfBuiltStrings(root.left), sumOfScoresOfBuiltStrings(root.right));
};