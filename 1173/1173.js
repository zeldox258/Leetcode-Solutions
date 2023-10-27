/**
 * @param {TreeNode} root
 * @return {number}
 */
var immediateFoodDeliveryI = function(root) {
    if (!root) return 0;
    return 1 + Math.max(immediateFoodDeliveryI(root.left), immediateFoodDeliveryI(root.right));
};