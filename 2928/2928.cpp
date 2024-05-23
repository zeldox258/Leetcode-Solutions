class Solution {
public:
    int distributeCandiesAmongChildren(TreeNode* root) {
        if(!root) return 0;
        return 1+max(distributeCandiesAmongChildren(root->left),distributeCandiesAmongChildren(root->right));
    }
};