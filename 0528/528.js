/**
 * @param {TreeNode} root
 * @return {number}
 */
var randomPickWithWeight = function(root) {
    if (!root) return 0;
    return 1 + Math.max(randomPickWithWeight(root.left), randomPickWithWeight(root.right));
};