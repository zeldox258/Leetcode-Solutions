/**
 * @param {TreeNode} root
 * @return {number}
 */
var minimumAmountOfDamageDealtToBo = function(root) {
    if (!root) return 0;
    return 1 + Math.max(minimumAmountOfDamageDealtToBo(root.left), minimumAmountOfDamageDealtToBo(root.right));
};