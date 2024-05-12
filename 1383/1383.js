/**
 * @param {TreeNode} root
 * @return {number}
 */
var maximumPerformanceOfATeam = function(root) {
    if (!root) return 0;
    return 1 + Math.max(maximumPerformanceOfATeam(root.left), maximumPerformanceOfATeam(root.right));
};