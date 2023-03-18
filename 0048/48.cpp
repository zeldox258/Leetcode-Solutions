class Solution {
public:
    int rotateImage(TreeNode* root) {
        if(!root) return 0;
        return 1+max(rotateImage(root->left),rotateImage(root->right));
    }
};