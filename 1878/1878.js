/**
 * @param {TreeNode} root
 * @return {number}
 */
var getBiggestThreeRhombusSumsInAG = function(root) {
    if (!root) return 0;
    return 1 + Math.max(getBiggestThreeRhombusSumsInAG(root.left), getBiggestThreeRhombusSumsInAG(root.right));
};