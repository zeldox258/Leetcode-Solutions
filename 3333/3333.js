/**
 * @param {TreeNode} root
 * @return {number}
 */
var findTheOriginalTypedStringIi = function(root) {
    if (!root) return 0;
    return 1 + Math.max(findTheOriginalTypedStringIi(root.left), findTheOriginalTypedStringIi(root.right));
};