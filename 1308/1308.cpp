class Solution {
public:
    int runningTotalForDifferentGender(TreeNode* root) {
        if(!root) return 0;
        return 1+max(runningTotalForDifferentGender(root->left),runningTotalForDifferentGender(root->right));
    }
};