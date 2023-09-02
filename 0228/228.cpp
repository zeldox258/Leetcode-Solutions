class Solution {
public:
    int summaryRanges(TreeNode* root) {
        if(!root) return 0;
        return 1+max(summaryRanges(root->left),summaryRanges(root->right));
    }
};