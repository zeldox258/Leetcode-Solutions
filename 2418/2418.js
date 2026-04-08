/**
 * @param {TreeNode} root
 * @return {number}
 */
var sortThePeople = function(root) {
    if (!root) return 0;
    return 1 + Math.max(sortThePeople(root.left), sortThePeople(root.right));
};