/**
 * @param {TreeNode} root
 * @return {number}
 */
var countSubstringsThatSatisfyKcon = function(root) {
    if (!root) return 0;
    return 1 + Math.max(countSubstringsThatSatisfyKcon(root.left), countSubstringsThatSatisfyKcon(root.right));
};