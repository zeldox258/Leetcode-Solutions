/**
 * @param {TreeNode} root
 * @return {number}
 */
var arrayWithElementsNotEqualToAve = function(root) {
    if (!root) return 0;
    return 1 + Math.max(arrayWithElementsNotEqualToAve(root.left), arrayWithElementsNotEqualToAve(root.right));
};