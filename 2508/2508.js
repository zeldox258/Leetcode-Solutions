/**
 * @param {TreeNode} root
 * @return {number}
 */
var addEdgesToMakeDegreesOfAllNode = function(root) {
    if (!root) return 0;
    return 1 + Math.max(addEdgesToMakeDegreesOfAllNode(root.left), addEdgesToMakeDegreesOfAllNode(root.right));
};