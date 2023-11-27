/**
 * @param {TreeNode} root
 * @return {number}
 */
var minimumSensorsToCoverGrid = function(root) {
    if (!root) return 0;
    return 1 + Math.max(minimumSensorsToCoverGrid(root.left), minimumSensorsToCoverGrid(root.right));
};