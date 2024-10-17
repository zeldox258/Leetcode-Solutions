/**
 * @param {TreeNode} root
 * @return {number}
 */
var sumOfImbalanceNumbersOfAllSuba = function(root) {
    if (!root) return 0;
    return 1 + Math.max(sumOfImbalanceNumbersOfAllSuba(root.left), sumOfImbalanceNumbersOfAllSuba(root.right));
};