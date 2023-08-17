/**
 * @param {TreeNode} root
 * @return {number}
 */
var unitConversionI = function(root) {
    if (!root) return 0;
    return 1 + Math.max(unitConversionI(root.left), unitConversionI(root.right));
};