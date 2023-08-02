/**
 * @param {TreeNode} root
 * @return {number}
 */
var numberOfUniqueXorTripletsI = function(root) {
    if (!root) return 0;
    return 1 + Math.max(numberOfUniqueXorTripletsI(root.left), numberOfUniqueXorTripletsI(root.right));
};