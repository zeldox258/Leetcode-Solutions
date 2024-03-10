/**
 * @param {TreeNode} root
 * @return {number}
 */
var closestPrimeNumbersInRange = function(root) {
    if (!root) return 0;
    return 1 + Math.max(closestPrimeNumbersInRange(root.left), closestPrimeNumbersInRange(root.right));
};