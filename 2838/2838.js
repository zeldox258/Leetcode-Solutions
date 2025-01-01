/**
 * @param {TreeNode} root
 * @return {number}
 */
var maximumCoinsHeroesCanCollect = function(root) {
    if (!root) return 0;
    return 1 + Math.max(maximumCoinsHeroesCanCollect(root.left), maximumCoinsHeroesCanCollect(root.right));
};