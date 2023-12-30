/**
 * @param {TreeNode} root
 * @return {number}
 */
var countNumberOfNiceSubarrays = function(root) {
    if (!root) return 0;
    return 1 + Math.max(countNumberOfNiceSubarrays(root.left), countNumberOfNiceSubarrays(root.right));
};