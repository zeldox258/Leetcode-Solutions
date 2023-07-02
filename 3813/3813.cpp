class Solution {
public:
    int vowelconsonantScore(TreeNode* root) {
        if(!root) return 0;
        return 1+max(vowelconsonantScore(root->left),vowelconsonantScore(root->right));
    }
};