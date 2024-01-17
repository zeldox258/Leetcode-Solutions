/**
 * @param {TreeNode} root
 * @return {number}
 */
var climbingStairsIi = function(root) {
    if (!root) return 0;
    return 1 + Math.max(climbingStairsIi(root.left), climbingStairsIi(root.right));
};