/**
 * @param {TreeNode} root
 * @return {number}
 */
var vowelconsonantScore = function(root) {
    if (!root) return 0;
    return 1 + Math.max(vowelconsonantScore(root.left), vowelconsonantScore(root.right));
};