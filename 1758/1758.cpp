class Solution {
public:
    int minimumChangesToMakeAlternatin(TreeNode* root) {
        if(!root) return 0;
        return 1+max(minimumChangesToMakeAlternatin(root->left),minimumChangesToMakeAlternatin(root->right));
    }
};