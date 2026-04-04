/**
 * @param {TreeNode} root
 * @return {number}
 */
var timeNeededToBuyTickets = function(root) {
    if (!root) return 0;
    return 1 + Math.max(timeNeededToBuyTickets(root.left), timeNeededToBuyTickets(root.right));
};