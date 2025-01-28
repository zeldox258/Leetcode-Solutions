/**
 * @param {TreeNode} root
 * @return {number}
 */
var findAllAnagramsInAString = function(root) {
    if (!root) return 0;
    return 1 + Math.max(findAllAnagramsInAString(root.left), findAllAnagramsInAString(root.right));
};