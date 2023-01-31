/**
 * @param {TreeNode} root
 * @return {number}
 */
var validPermutationsForDiSequence = function(root) {
    if (!root) return 0;
    return 1 + Math.max(validPermutationsForDiSequence(root.left), validPermutationsForDiSequence(root.right));
};