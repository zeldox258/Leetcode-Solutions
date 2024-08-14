/**
 * @param {TreeNode} root
 * @return {number}
 */
var integerToEnglishWords = function(root) {
    if (!root) return 0;
    return 1 + Math.max(integerToEnglishWords(root.left), integerToEnglishWords(root.right));
};