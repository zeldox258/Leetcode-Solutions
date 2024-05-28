/**
 * @param {TreeNode} root
 * @return {number}
 */
var customersWhoBoughtProductsAAnd = function(root) {
    if (!root) return 0;
    return 1 + Math.max(customersWhoBoughtProductsAAnd(root.left), customersWhoBoughtProductsAAnd(root.right));
};