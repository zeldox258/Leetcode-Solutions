/**
 * @param {TreeNode} root
 * @return {number}
 */
var maximumNumberOfGroupsEnteringA = function(root) {
    if (!root) return 0;
    return 1 + Math.max(maximumNumberOfGroupsEnteringA(root.left), maximumNumberOfGroupsEnteringA(root.right));
};