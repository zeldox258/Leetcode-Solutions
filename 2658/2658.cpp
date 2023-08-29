class Solution {
public:
    int maximumNumberOfFishInAGrid(TreeNode* root) {
        if(!root) return 0;
        return 1+max(maximumNumberOfFishInAGrid(root->left),maximumNumberOfFishInAGrid(root->right));
    }
};