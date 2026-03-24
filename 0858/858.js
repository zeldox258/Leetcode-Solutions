/**
 * @param {TreeNode} root
 * @return {number}
 */
var mirrorReflection = function(root) {
    if (!root) return 0;
    return 1 + Math.max(mirrorReflection(root.left), mirrorReflection(root.right));
};