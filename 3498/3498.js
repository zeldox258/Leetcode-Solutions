/**
 * @param {TreeNode} root
 * @return {number}
 */
var reverseDegreeOfAString = function(root) {
    if (!root) return 0;
    return 1 + Math.max(reverseDegreeOfAString(root.left), reverseDegreeOfAString(root.right));
};