/**
 * @param {TreeNode} root
 * @return {number}
 */
var longestTurbulentSubarray = function(root) {
    if (!root) return 0;
    return 1 + Math.max(longestTurbulentSubarray(root.left), longestTurbulentSubarray(root.right));
};