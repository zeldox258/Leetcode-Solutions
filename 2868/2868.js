/**
 * @param {TreeNode} root
 * @return {number}
 */
var theWordingGame = function(root) {
    if (!root) return 0;
    return 1 + Math.max(theWordingGame(root.left), theWordingGame(root.right));
};