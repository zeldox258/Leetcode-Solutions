/**
 * @param {TreeNode} root
 * @return {number}
 */
var avoidFloodInTheCity = function(root) {
    if (!root) return 0;
    return 1 + Math.max(avoidFloodInTheCity(root.left), avoidFloodInTheCity(root.right));
};