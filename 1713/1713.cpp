class Solution {
public:
    int minimumOperationsToMakeASubseq(TreeNode* root) {
        if(!root) return 0;
        return 1+max(minimumOperationsToMakeASubseq(root->left),minimumOperationsToMakeASubseq(root->right));
    }
};