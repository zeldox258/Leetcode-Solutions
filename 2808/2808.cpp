class Solution {
public:
    int minimumSecondsToEqualizeACircu(TreeNode* root) {
        if(!root) return 0;
        return 1+max(minimumSecondsToEqualizeACircu(root->left),minimumSecondsToEqualizeACircu(root->right));
    }
};