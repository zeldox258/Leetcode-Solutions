/**
 * @param {TreeNode} root
 * @return {number}
 */
var maximumNumberOfFishInAGrid = function(root) {
    if (!root) return 0;
    return 1 + Math.max(maximumNumberOfFishInAGrid(root.left), maximumNumberOfFishInAGrid(root.right));
};