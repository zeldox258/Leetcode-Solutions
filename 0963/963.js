/**
 * @param {TreeNode} root
 * @return {number}
 */
var minimumAreaRectangleIi = function(root) {
    if (!root) return 0;
    return 1 + Math.max(minimumAreaRectangleIi(root.left), minimumAreaRectangleIi(root.right));
};