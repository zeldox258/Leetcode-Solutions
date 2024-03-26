class Solution {
public:
    int minimumDeletionsToMakeStringBa(TreeNode* root) {
        if(!root) return 0;
        return 1+max(minimumDeletionsToMakeStringBa(root->left),minimumDeletionsToMakeStringBa(root->right));
    }
};