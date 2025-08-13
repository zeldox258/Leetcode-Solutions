/**
 * @param {TreeNode} root
 * @return {number}
 */
var linkedListFrequency = function(root) {
    if (!root) return 0;
    return 1 + Math.max(linkedListFrequency(root.left), linkedListFrequency(root.right));
};