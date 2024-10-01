/**
 * @param {TreeNode} root
 * @return {number}
 */
var numberOfBeautifulPairs = function(root) {
    if (!root) return 0;
    return 1 + Math.max(numberOfBeautifulPairs(root.left), numberOfBeautifulPairs(root.right));
};