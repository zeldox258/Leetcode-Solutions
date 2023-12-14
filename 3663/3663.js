/**
 * @param {TreeNode} root
 * @return {number}
 */
var findTheLeastFrequentDigit = function(root) {
    if (!root) return 0;
    return 1 + Math.max(findTheLeastFrequentDigit(root.left), findTheLeastFrequentDigit(root.right));
};