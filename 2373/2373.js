/**
 * @param {TreeNode} root
 * @return {number}
 */
var largestLocalValuesInAMatrix = function(root) {
    if (!root) return 0;
    return 1 + Math.max(largestLocalValuesInAMatrix(root.left), largestLocalValuesInAMatrix(root.right));
};