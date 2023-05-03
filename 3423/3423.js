/**
 * @param {TreeNode} root
 * @return {number}
 */
var maximumDifferenceBetweenAdjace = function(root) {
    if (!root) return 0;
    return 1 + Math.max(maximumDifferenceBetweenAdjace(root.left), maximumDifferenceBetweenAdjace(root.right));
};