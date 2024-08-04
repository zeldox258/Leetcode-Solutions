class Solution {
public:
    int maximizeTheBeautyOfTheGarden(TreeNode* root) {
        if(!root) return 0;
        return 1+max(maximizeTheBeautyOfTheGarden(root->left),maximizeTheBeautyOfTheGarden(root->right));
    }
};