/**
 * @param {TreeNode} root
 * @return {number}
 */
var minimumLengthOfAnagramConcaten = function(root) {
    if (!root) return 0;
    return 1 + Math.max(minimumLengthOfAnagramConcaten(root.left), minimumLengthOfAnagramConcaten(root.right));
};