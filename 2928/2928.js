/**
 * @param {TreeNode} root
 * @return {number}
 */
var distributeCandiesAmongChildren = function(root) {
    if (!root) return 0;
    return 1 + Math.max(distributeCandiesAmongChildren(root.left), distributeCandiesAmongChildren(root.right));
};