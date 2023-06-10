/**
 * @param {TreeNode} root
 * @return {number}
 */
var numberOfTimesADriverWasAPassen = function(root) {
    if (!root) return 0;
    return 1 + Math.max(numberOfTimesADriverWasAPassen(root.left), numberOfTimesADriverWasAPassen(root.right));
};