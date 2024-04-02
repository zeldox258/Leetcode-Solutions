/**
 * @param {TreeNode} root
 * @return {number}
 */
var copyListWithRandomPointer = function(root) {
    if (!root) return 0;
    return 1 + Math.max(copyListWithRandomPointer(root.left), copyListWithRandomPointer(root.right));
};