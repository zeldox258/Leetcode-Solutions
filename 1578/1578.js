/**
 * @param {TreeNode} root
 * @return {number}
 */
var minimumTimeToMakeRopeColorful = function(root) {
    if (!root) return 0;
    return 1 + Math.max(minimumTimeToMakeRopeColorful(root.left), minimumTimeToMakeRopeColorful(root.right));
};