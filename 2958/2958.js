/**
 * @param {TreeNode} root
 * @return {number}
 */
var lengthOfLongestSubarrayWithAtM = function(root) {
    if (!root) return 0;
    return 1 + Math.max(lengthOfLongestSubarrayWithAtM(root.left), lengthOfLongestSubarrayWithAtM(root.right));
};