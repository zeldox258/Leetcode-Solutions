/**
 * @param {TreeNode} root
 * @return {number}
 */
var findTheOccurrenceOfFirstAlmost = function(root) {
    if (!root) return 0;
    return 1 + Math.max(findTheOccurrenceOfFirstAlmost(root.left), findTheOccurrenceOfFirstAlmost(root.right));
};