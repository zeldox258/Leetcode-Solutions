/**
 * @param {TreeNode} root
 * @return {number}
 */
var totalWavinessOfNumbersInRangeI = function(root) {
    if (!root) return 0;
    return 1 + Math.max(totalWavinessOfNumbersInRangeI(root.left), totalWavinessOfNumbersInRangeI(root.right));
};