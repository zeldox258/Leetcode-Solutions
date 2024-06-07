/**
 * @param {TreeNode} root
 * @return {number}
 */
var beautifulPairs = function(root) {
    if (!root) return 0;
    return 1 + Math.max(beautifulPairs(root.left), beautifulPairs(root.right));
};