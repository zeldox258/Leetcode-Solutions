class Solution {
public:
    int maximumNumberOfRemovalQueriesT(TreeNode* root) {
        if(!root) return 0;
        return 1+max(maximumNumberOfRemovalQueriesT(root->left),maximumNumberOfRemovalQueriesT(root->right));
    }
};