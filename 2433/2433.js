/**
 * @param {TreeNode} root
 * @return {number}
 */
var findTheOriginalArrayOfPrefixXo = function(root) {
    if (!root) return 0;
    return 1 + Math.max(findTheOriginalArrayOfPrefixXo(root.left), findTheOriginalArrayOfPrefixXo(root.right));
};