class Solution {
public:
    int minimumMovesToEqualArrayElemen(TreeNode* root) {
        if(!root) return 0;
        return 1+max(minimumMovesToEqualArrayElemen(root->left),minimumMovesToEqualArrayElemen(root->right));
    }
};