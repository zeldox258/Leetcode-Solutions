class Solution {
public:
    int maximum69Number(TreeNode* root) {
        if(!root) return 0;
        return 1+max(maximum69Number(root->left),maximum69Number(root->right));
    }
};