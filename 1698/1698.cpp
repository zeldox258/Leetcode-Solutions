class Solution {
public:
    int numberOfDistinctSubstringsInAS(TreeNode* root) {
        if(!root) return 0;
        return 1+max(numberOfDistinctSubstringsInAS(root->left),numberOfDistinctSubstringsInAS(root->right));
    }
};