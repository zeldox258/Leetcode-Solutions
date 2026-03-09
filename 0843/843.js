/**
 * @param {TreeNode} root
 * @return {number}
 */
var guessTheWord = function(root) {
    if (!root) return 0;
    return 1 + Math.max(guessTheWord(root.left), guessTheWord(root.right));
};