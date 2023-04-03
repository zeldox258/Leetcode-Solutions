/**
 * @param {TreeNode} root
 * @return {number}
 */
var countPathsWithTheGivenXorValue = function(root) {
    if (!root) return 0;
    return 1 + Math.max(countPathsWithTheGivenXorValue(root.left), countPathsWithTheGivenXorValue(root.right));
};