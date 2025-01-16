/**
 * @param {TreeNode} root
 * @return {number}
 */
var highestSalariesDifference = function(root) {
    if (!root) return 0;
    return 1 + Math.max(highestSalariesDifference(root.left), highestSalariesDifference(root.right));
};