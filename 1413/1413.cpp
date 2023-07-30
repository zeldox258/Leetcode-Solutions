class Solution {
public:
    int minimumValueToGetPositiveStepB(TreeNode* root) {
        if(!root) return 0;
        return 1+max(minimumValueToGetPositiveStepB(root->left),minimumValueToGetPositiveStepB(root->right));
    }
};