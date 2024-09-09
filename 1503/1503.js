/**
 * @param {TreeNode} root
 * @return {number}
 */
var lastMomentBeforeAllAntsFallOut = function(root) {
    if (!root) return 0;
    return 1 + Math.max(lastMomentBeforeAllAntsFallOut(root.left), lastMomentBeforeAllAntsFallOut(root.right));
};