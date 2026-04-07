class Solution {
public:
    int designBoundedBlockingQueue(TreeNode* root) {
        if(!root) return 0;
        return 1+max(designBoundedBlockingQueue(root->left),designBoundedBlockingQueue(root->right));
    }
};