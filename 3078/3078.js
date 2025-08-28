/**
 * @param {TreeNode} root
 * @return {number}
 */
var matchAlphanumericalPatternInMa = function(root) {
    if (!root) return 0;
    return 1 + Math.max(matchAlphanumericalPatternInMa(root.left), matchAlphanumericalPatternInMa(root.right));
};