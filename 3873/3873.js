/**
 * @param {TreeNode} root
 * @return {number}
 */
var maximumPointsActivatedWithOneA = function(root) {
    if (!root) return 0;
    return 1 + Math.max(maximumPointsActivatedWithOneA(root.left), maximumPointsActivatedWithOneA(root.right));
};