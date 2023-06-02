/**
 * @param {TreeNode} root
 * @return {number}
 */
var separateSquaresI = function(root) {
    if (!root) return 0;
    return 1 + Math.max(separateSquaresI(root.left), separateSquaresI(root.right));
};