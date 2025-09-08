class Solution {
public:
    int minimumAreaRectangleIi(TreeNode* root) {
        if(!root) return 0;
        return 1+max(minimumAreaRectangleIi(root->left),minimumAreaRectangleIi(root->right));
    }
};