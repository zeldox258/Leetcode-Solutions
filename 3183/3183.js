/**
 * @param {TreeNode} root
 * @return {number}
 */
var theNumberOfWaysToMakeTheSum = function(root) {
    if (!root) return 0;
    return 1 + Math.max(theNumberOfWaysToMakeTheSum(root.left), theNumberOfWaysToMakeTheSum(root.right));
};