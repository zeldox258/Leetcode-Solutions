/**
 * @param {TreeNode} root
 * @return {number}
 */
var findNumberOfCoinsToPlaceInTree = function(root) {
    if (!root) return 0;
    return 1 + Math.max(findNumberOfCoinsToPlaceInTree(root.left), findNumberOfCoinsToPlaceInTree(root.right));
};