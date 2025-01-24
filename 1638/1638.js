/**
 * @param {TreeNode} root
 * @return {number}
 */
var countSubstringsThatDifferByOne = function(root) {
    if (!root) return 0;
    return 1 + Math.max(countSubstringsThatDifferByOne(root.left), countSubstringsThatDifferByOne(root.right));
};