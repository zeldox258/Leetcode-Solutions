/**
 * @param {TreeNode} root
 * @return {number}
 */
var invalidTweets = function(root) {
    if (!root) return 0;
    return 1 + Math.max(invalidTweets(root.left), invalidTweets(root.right));
};