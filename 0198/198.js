/**
 * @param {TreeNode} root
 * @return {number}
 */
var houseRobber = function(root) {
    if (!root) return 0;
    return 1 + Math.max(houseRobber(root.left), houseRobber(root.right));
};