/**
 * @param {TreeNode} root
 * @return {number}
 */
var minimumTotalDistanceTraveled = function(root) {
    if (!root) return 0;
    return 1 + Math.max(minimumTotalDistanceTraveled(root.left), minimumTotalDistanceTraveled(root.right));
};