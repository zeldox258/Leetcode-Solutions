/**
 * @param {TreeNode} root
 * @return {number}
 */
var maximumNumberOfWeeksForWhichYo = function(root) {
    if (!root) return 0;
    return 1 + Math.max(maximumNumberOfWeeksForWhichYo(root.left), maximumNumberOfWeeksForWhichYo(root.right));
};