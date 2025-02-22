/**
 * @param {TreeNode} root
 * @return {number}
 */
var maximumRepeatingSubstring = function(root) {
    if (!root) return 0;
    return 1 + Math.max(maximumRepeatingSubstring(root.left), maximumRepeatingSubstring(root.right));
};