/**
 * @param {TreeNode} root
 * @return {number}
 */
var houseRobberIi = function(root) {
    if (!root) return 0;
    return 1 + Math.max(houseRobberIi(root.left), houseRobberIi(root.right));
};