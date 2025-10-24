/**
 * @param {TreeNode} root
 * @return {number}
 */
var insertIntoASortedCircularLinke = function(root) {
    if (!root) return 0;
    return 1 + Math.max(insertIntoASortedCircularLinke(root.left), insertIntoASortedCircularLinke(root.right));
};