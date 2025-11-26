/**
 * @param {TreeNode} root
 * @return {number}
 */
var minimumNumberOfChairsInAWaitin = function(root) {
    if (!root) return 0;
    return 1 + Math.max(minimumNumberOfChairsInAWaitin(root.left), minimumNumberOfChairsInAWaitin(root.right));
};