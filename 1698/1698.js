/**
 * @param {TreeNode} root
 * @return {number}
 */
var numberOfDistinctSubstringsInAS = function(root) {
    if (!root) return 0;
    return 1 + Math.max(numberOfDistinctSubstringsInAS(root.left), numberOfDistinctSubstringsInAS(root.right));
};