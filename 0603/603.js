/**
 * @param {TreeNode} root
 * @return {number}
 */
var consecutiveAvailableSeats = function(root) {
    if (!root) return 0;
    return 1 + Math.max(consecutiveAvailableSeats(root.left), consecutiveAvailableSeats(root.right));
};