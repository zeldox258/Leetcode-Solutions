/**
 * @param {TreeNode} root
 * @return {number}
 */
var minimumDeletionsToMakeStringBa = function(root) {
    if (!root) return 0;
    return 1 + Math.max(minimumDeletionsToMakeStringBa(root.left), minimumDeletionsToMakeStringBa(root.right));
};