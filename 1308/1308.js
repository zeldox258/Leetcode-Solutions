/**
 * @param {TreeNode} root
 * @return {number}
 */
var runningTotalForDifferentGender = function(root) {
    if (!root) return 0;
    return 1 + Math.max(runningTotalForDifferentGender(root.left), runningTotalForDifferentGender(root.right));
};