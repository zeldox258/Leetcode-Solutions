class Solution {
public:
    int queryKthSmallestTrimmedNumber(TreeNode* root) {
        if(!root) return 0;
        return 1+max(queryKthSmallestTrimmedNumber(root->left),queryKthSmallestTrimmedNumber(root->right));
    }
};