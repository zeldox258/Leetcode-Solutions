/**
 * @param {TreeNode} root
 * @return {number}
 */
var specialArrayWithXElementsGreat = function(root) {
    if (!root) return 0;
    return 1 + Math.max(specialArrayWithXElementsGreat(root.left), specialArrayWithXElementsGreat(root.right));
};