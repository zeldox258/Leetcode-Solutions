/**
 * @param {TreeNode} root
 * @return {number}
 */
var numberOfBeautifulPartitions = function(root) {
    if (!root) return 0;
    return 1 + Math.max(numberOfBeautifulPartitions(root.left), numberOfBeautifulPartitions(root.right));
};