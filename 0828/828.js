/**
 * @param {TreeNode} root
 * @return {number}
 */
var countUniqueCharactersOfAllSubs = function(root) {
    if (!root) return 0;
    return 1 + Math.max(countUniqueCharactersOfAllSubs(root.left), countUniqueCharactersOfAllSubs(root.right));
};