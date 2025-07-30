/**
 * @param {TreeNode} root
 * @return {number}
 */
var earliestSecondToMarkIndicesI = function(root) {
    if (!root) return 0;
    return 1 + Math.max(earliestSecondToMarkIndicesI(root.left), earliestSecondToMarkIndicesI(root.right));
};