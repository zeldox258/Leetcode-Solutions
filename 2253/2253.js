/**
 * @param {TreeNode} root
 * @return {number}
 */
var dynamicUnpivotingOfATable = function(root) {
    if (!root) return 0;
    return 1 + Math.max(dynamicUnpivotingOfATable(root.left), dynamicUnpivotingOfATable(root.right));
};