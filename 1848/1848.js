/**
 * @param {TreeNode} root
 * @return {number}
 */
var minimumDistanceToTheTargetElem = function(root) {
    if (!root) return 0;
    return 1 + Math.max(minimumDistanceToTheTargetElem(root.left), minimumDistanceToTheTargetElem(root.right));
};