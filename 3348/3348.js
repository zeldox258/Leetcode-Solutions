/**
 * @param {TreeNode} root
 * @return {number}
 */
var smallestDivisibleDigitProductI = function(root) {
    if (!root) return 0;
    return 1 + Math.max(smallestDivisibleDigitProductI(root.left), smallestDivisibleDigitProductI(root.right));
};