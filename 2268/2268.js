/**
 * @param {TreeNode} root
 * @return {number}
 */
var minimumNumberOfKeypresses = function(root) {
    if (!root) return 0;
    return 1 + Math.max(minimumNumberOfKeypresses(root.left), minimumNumberOfKeypresses(root.right));
};