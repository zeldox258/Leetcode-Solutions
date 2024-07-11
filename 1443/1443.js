/**
 * @param {TreeNode} root
 * @return {number}
 */
var minimumTimeToCollectAllApplesI = function(root) {
    if (!root) return 0;
    return 1 + Math.max(minimumTimeToCollectAllApplesI(root.left), minimumTimeToCollectAllApplesI(root.right));
};