class Solution {
public:
    int maximumCoinsHeroesCanCollect(TreeNode* root) {
        if(!root) return 0;
        return 1+max(maximumCoinsHeroesCanCollect(root->left),maximumCoinsHeroesCanCollect(root->right));
    }
};