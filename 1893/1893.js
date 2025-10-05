/**
 * @param {TreeNode} root
 * @return {number}
 */
var checkIfAllTheIntegersInARangeA = function(root) {
    if (!root) return 0;
    return 1 + Math.max(checkIfAllTheIntegersInARangeA(root.left), checkIfAllTheIntegersInARangeA(root.right));
};