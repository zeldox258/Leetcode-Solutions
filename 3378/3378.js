/**
 * @param {TreeNode} root
 * @return {number}
 */
var countConnectedComponentsInLcmG = function(root) {
    if (!root) return 0;
    return 1 + Math.max(countConnectedComponentsInLcmG(root.left), countConnectedComponentsInLcmG(root.right));
};