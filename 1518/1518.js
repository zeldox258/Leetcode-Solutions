/**
 * @param {TreeNode} root
 * @return {number}
 */
var waterBottles = function(root) {
    if (!root) return 0;
    return 1 + Math.max(waterBottles(root.left), waterBottles(root.right));
};