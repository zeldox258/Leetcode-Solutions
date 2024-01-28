/**
 * @param {TreeNode} root
 * @return {number}
 */
var palindromePartitioningIii = function(root) {
    if (!root) return 0;
    return 1 + Math.max(palindromePartitioningIii(root.left), palindromePartitioningIii(root.right));
};