/**
 * @param {TreeNode} root
 * @return {number}
 */
var replaceWords = function(root) {
    if (!root) return 0;
    return 1 + Math.max(replaceWords(root.left), replaceWords(root.right));
};