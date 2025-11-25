class Solution {
public:
    int minimumNumberOfKeypresses(TreeNode* root) {
        if(!root) return 0;
        return 1+max(minimumNumberOfKeypresses(root->left),minimumNumberOfKeypresses(root->right));
    }
};