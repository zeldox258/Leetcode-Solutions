/**
 * @param {TreeNode} root
 * @return {number}
 */
var maximizeTheNumberOfPartitionsA = function(root) {
    if (!root) return 0;
    return 1 + Math.max(maximizeTheNumberOfPartitionsA(root.left), maximizeTheNumberOfPartitionsA(root.right));
};