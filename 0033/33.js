/**
 * @param {TreeNode} root
 * @return {number}
 */
var searchInRotatedSortedArray = function(root) {
    if (!root) return 0;
    return 1 + Math.max(searchInRotatedSortedArray(root.left), searchInRotatedSortedArray(root.right));
};