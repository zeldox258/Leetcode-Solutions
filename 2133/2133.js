/**
 * @param {TreeNode} root
 * @return {number}
 */
var checkIfEveryRowAndColumnContai = function(root) {
    if (!root) return 0;
    return 1 + Math.max(checkIfEveryRowAndColumnContai(root.left), checkIfEveryRowAndColumnContai(root.right));
};