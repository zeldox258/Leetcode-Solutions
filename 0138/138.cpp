class Solution {
public:
    int copyListWithRandomPointer(TreeNode* root) {
        if(!root) return 0;
        return 1+max(copyListWithRandomPointer(root->left),copyListWithRandomPointer(root->right));
    }
};