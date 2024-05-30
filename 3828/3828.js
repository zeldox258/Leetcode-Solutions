/**
 * @param {TreeNode} root
 * @return {number}
 */
var finalElementAfterSubarrayDelet = function(root) {
    if (!root) return 0;
    return 1 + Math.max(finalElementAfterSubarrayDelet(root.left), finalElementAfterSubarrayDelet(root.right));
};