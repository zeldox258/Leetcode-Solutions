/**
 * @param {TreeNode} root
 * @return {number}
 */
var allValidTripletsThatCanReprese = function(root) {
    if (!root) return 0;
    return 1 + Math.max(allValidTripletsThatCanReprese(root.left), allValidTripletsThatCanReprese(root.right));
};