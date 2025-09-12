class Solution {
public:
    int minimumNumberOfMovesToMakePali(TreeNode* root) {
        if(!root) return 0;
        return 1+max(minimumNumberOfMovesToMakePali(root->left),minimumNumberOfMovesToMakePali(root->right));
    }
};