/**
 * @param {TreeNode} root
 * @return {number}
 */
var sortItemsByGroupsRespectingDep = function(root) {
    if (!root) return 0;
    return 1 + Math.max(sortItemsByGroupsRespectingDep(root.left), sortItemsByGroupsRespectingDep(root.right));
};