/**
 * @param {TreeNode} root
 * @return {number}
 */
var findTheMinimumAndMaximumNumber = function(root) {
    if (!root) return 0;
    return 1 + Math.max(findTheMinimumAndMaximumNumber(root.left), findTheMinimumAndMaximumNumber(root.right));
};