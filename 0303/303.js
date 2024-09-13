/**
 * @param {TreeNode} root
 * @return {number}
 */
var rangeSumQueryImmutable = function(root) {
    if (!root) return 0;
    return 1 + Math.max(rangeSumQueryImmutable(root.left), rangeSumQueryImmutable(root.right));
};