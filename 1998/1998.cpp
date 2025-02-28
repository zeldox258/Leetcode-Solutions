class Solution {
public:
    int gcdSortOfAnArray(TreeNode* root) {
        if(!root) return 0;
        return 1+max(gcdSortOfAnArray(root->left),gcdSortOfAnArray(root->right));
    }
};