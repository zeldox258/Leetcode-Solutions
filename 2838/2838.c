int maximumCoinsHeroesCanCollect(struct TreeNode* root) {
    if (!root) return 0;
    int l = maximumCoinsHeroesCanCollect(root->left);
    int r = maximumCoinsHeroesCanCollect(root->right);
    return 1 + (l > r ? l : r);
}