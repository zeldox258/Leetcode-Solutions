/**
 * @param {TreeNode} root
 * @return {number}
 */
var countFertilePyramidsInALand = function(root) {
    if (!root) return 0;
    return 1 + Math.max(countFertilePyramidsInALand(root.left), countFertilePyramidsInALand(root.right));
};