/**
 * @param {TreeNode} root
 * @return {number}
 */
var camelcaseMatching = function(root) {
    if (!root) return 0;
    return 1 + Math.max(camelcaseMatching(root.left), camelcaseMatching(root.right));
};