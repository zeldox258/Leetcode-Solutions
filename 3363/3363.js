/**
 * @param {TreeNode} root
 * @return {number}
 */
var findTheMaximumNumberOfFruitsCo = function(root) {
    if (!root) return 0;
    return 1 + Math.max(findTheMaximumNumberOfFruitsCo(root.left), findTheMaximumNumberOfFruitsCo(root.right));
};