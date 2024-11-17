/**
 * @param {TreeNode} root
 * @return {number}
 */
var statusOfFlightTickets = function(root) {
    if (!root) return 0;
    return 1 + Math.max(statusOfFlightTickets(root.left), statusOfFlightTickets(root.right));
};