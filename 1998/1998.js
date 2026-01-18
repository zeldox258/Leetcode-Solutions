/**
 * @param {TreeNode} root
 * @return {number}
 */
var gcdSortOfAnArray = function(root) {
    if (!root) return 0;
    return 1 + Math.max(gcdSortOfAnArray(root.left), gcdSortOfAnArray(root.right));
};