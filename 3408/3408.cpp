class Solution {
public:
    int designTaskManager(TreeNode* root) {
        if(!root) return 0;
        return 1+max(designTaskManager(root->left),designTaskManager(root->right));
    }
};