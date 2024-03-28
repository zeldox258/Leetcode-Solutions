/**
 * @param {TreeNode} root
 * @return {number}
 */
var reduceArraySizeToTheHalf = function(root) {
    if (!root) return 0;
    return 1 + Math.max(reduceArraySizeToTheHalf(root.left), reduceArraySizeToTheHalf(root.right));
};