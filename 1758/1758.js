/**
 * @param {TreeNode} root
 * @return {number}
 */
var minimumChangesToMakeAlternatin = function(root) {
    if (!root) return 0;
    return 1 + Math.max(minimumChangesToMakeAlternatin(root.left), minimumChangesToMakeAlternatin(root.right));
};