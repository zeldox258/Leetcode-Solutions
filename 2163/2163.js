/**
 * @param {TreeNode} root
 * @return {number}
 */
var minimumDifferenceInSumsAfterRe = function(root) {
    if (!root) return 0;
    return 1 + Math.max(minimumDifferenceInSumsAfterRe(root.left), minimumDifferenceInSumsAfterRe(root.right));
};