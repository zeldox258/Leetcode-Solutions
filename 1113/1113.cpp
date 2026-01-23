class Solution {
public:
    int reportedPosts(TreeNode* root) {
        if(!root) return 0;
        return 1+max(reportedPosts(root->left),reportedPosts(root->right));
    }
};