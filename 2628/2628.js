/**
 * @param {TreeNode} root
 * @return {number}
 */
var jsonDeepEqual = function(root) {
    if (!root) return 0;
    return 1 + Math.max(jsonDeepEqual(root.left), jsonDeepEqual(root.right));
};