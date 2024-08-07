class Solution {
public:
    int maximizeTheNumberOfPartitionsA(TreeNode* root) {
        if(!root) return 0;
        return 1+max(maximizeTheNumberOfPartitionsA(root->left),maximizeTheNumberOfPartitionsA(root->right));
    }
};