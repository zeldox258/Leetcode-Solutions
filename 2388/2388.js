/**
 * @param {TreeNode} root
 * @return {number}
 */
var changeNullValuesInATableToTheP = function(root) {
    if (!root) return 0;
    return 1 + Math.max(changeNullValuesInATableToTheP(root.left), changeNullValuesInATableToTheP(root.right));
};