/**
 * @param {TreeNode} root
 * @return {number}
 */
var unique3digitEvenNumbers = function(root) {
    if (!root) return 0;
    return 1 + Math.max(unique3digitEvenNumbers(root.left), unique3digitEvenNumbers(root.right));
};