class Solution {
public:
    int findBottomLeftTreeValue(TreeNode* root) {
        if(!root) return 0;
        return 1+max(findBottomLeftTreeValue(root->left),findBottomLeftTreeValue(root->right));
    }
};