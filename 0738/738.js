/**
 * @param {TreeNode} root
 * @return {number}
 */
var monotoneIncreasingDigits = function(root) {
    if (!root) return 0;
    return 1 + Math.max(monotoneIncreasingDigits(root.left), monotoneIncreasingDigits(root.right));
};