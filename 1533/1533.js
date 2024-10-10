/**
 * @param {TreeNode} root
 * @return {number}
 */
var findTheIndexOfTheLargeInteger = function(root) {
    if (!root) return 0;
    return 1 + Math.max(findTheIndexOfTheLargeInteger(root.left), findTheIndexOfTheLargeInteger(root.right));
};