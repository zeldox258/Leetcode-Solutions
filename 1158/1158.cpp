class Solution {
public:
    int marketAnalysisI(TreeNode* root) {
        if(!root) return 0;
        return 1+max(marketAnalysisI(root->left),marketAnalysisI(root->right));
    }
};