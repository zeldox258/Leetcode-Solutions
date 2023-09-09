/**
 * @param {TreeNode} root
 * @return {number}
 */
var numberOfIncreasingPathsInAGrid = function(root) {
    if (!root) return 0;
    return 1 + Math.max(numberOfIncreasingPathsInAGrid(root.left), numberOfIncreasingPathsInAGrid(root.right));
};