/**
 * @param {TreeNode} root
 * @return {number}
 */
var findMinimumInRotatedSortedArra = function(root) {
    if (!root) return 0;
    return 1 + Math.max(findMinimumInRotatedSortedArra(root.left), findMinimumInRotatedSortedArra(root.right));
};