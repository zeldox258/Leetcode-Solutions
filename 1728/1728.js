/**
 * @param {TreeNode} root
 * @return {number}
 */
var catAndMouseIi = function(root) {
    if (!root) return 0;
    return 1 + Math.max(catAndMouseIi(root.left), catAndMouseIi(root.right));
};