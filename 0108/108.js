/**
 * @param {TreeNode} root
 * @return {number}
 */
var convertSortedArrayToBinarySear = function(root) {
    if (!root) return 0;
    return 1 + Math.max(convertSortedArrayToBinarySear(root.left), convertSortedArrayToBinarySear(root.right));
};