/**
 * @param {TreeNode} root
 * @return {number}
 */
var minimumTimeToKillAllMonsters = function(root) {
    if (!root) return 0;
    return 1 + Math.max(minimumTimeToKillAllMonsters(root.left), minimumTimeToKillAllMonsters(root.right));
};