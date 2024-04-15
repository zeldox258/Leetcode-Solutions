/**
 * @param {TreeNode} root
 * @return {number}
 */
var mirrorDistanceOfAnInteger = function(root) {
    if (!root) return 0;
    return 1 + Math.max(mirrorDistanceOfAnInteger(root.left), mirrorDistanceOfAnInteger(root.right));
};