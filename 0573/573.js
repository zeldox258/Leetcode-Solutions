/**
 * @param {TreeNode} root
 * @return {number}
 */
var squirrelSimulation = function(root) {
    if (!root) return 0;
    return 1 + Math.max(squirrelSimulation(root.left), squirrelSimulation(root.right));
};