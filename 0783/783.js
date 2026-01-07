/**
 * @param {TreeNode} root
 * @return {number}
 */
var minimumDistanceBetweenBstNodes = function(root) {
    if (!root) return 0;
    return 1 + Math.max(minimumDistanceBetweenBstNodes(root.left), minimumDistanceBetweenBstNodes(root.right));
};