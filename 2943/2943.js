/**
 * @param {TreeNode} root
 * @return {number}
 */
var maximizeAreaOfSquareHoleInGrid = function(root) {
    if (!root) return 0;
    return 1 + Math.max(maximizeAreaOfSquareHoleInGrid(root.left), maximizeAreaOfSquareHoleInGrid(root.right));
};