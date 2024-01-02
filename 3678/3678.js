/**
 * @param {TreeNode} root
 * @return {number}
 */
var smallestAbsentPositiveGreaterT = function(root) {
    if (!root) return 0;
    return 1 + Math.max(smallestAbsentPositiveGreaterT(root.left), smallestAbsentPositiveGreaterT(root.right));
};