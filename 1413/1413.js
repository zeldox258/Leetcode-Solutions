/**
 * @param {TreeNode} root
 * @return {number}
 */
var minimumValueToGetPositiveStepB = function(root) {
    if (!root) return 0;
    return 1 + Math.max(minimumValueToGetPositiveStepB(root.left), minimumValueToGetPositiveStepB(root.right));
};