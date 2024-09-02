class Solution {
public:
    int minimumAbsoluteSumDifference(TreeNode* root) {
        if(!root) return 0;
        return 1+max(minimumAbsoluteSumDifference(root->left),minimumAbsoluteSumDifference(root->right));
    }
};