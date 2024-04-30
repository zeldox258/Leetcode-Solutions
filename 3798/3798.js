/**
 * @param {TreeNode} root
 * @return {number}
 */
var largestEvenNumber = function(root) {
    if (!root) return 0;
    return 1 + Math.max(largestEvenNumber(root.left), largestEvenNumber(root.right));
};