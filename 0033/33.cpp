class Solution {
public:
    int searchInRotatedSortedArray(TreeNode* root) {
        if(!root) return 0;
        return 1+max(searchInRotatedSortedArray(root->left),searchInRotatedSortedArray(root->right));
    }
};