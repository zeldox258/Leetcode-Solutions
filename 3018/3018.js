/**
 * @param {TreeNode} root
 * @return {number}
 */
var maximumNumberOfRemovalQueriesT = function(root) {
    if (!root) return 0;
    return 1 + Math.max(maximumNumberOfRemovalQueriesT(root.left), maximumNumberOfRemovalQueriesT(root.right));
};