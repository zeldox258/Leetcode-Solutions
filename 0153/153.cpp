class Solution {
public:
    int findMinimumInRotatedSortedArra(TreeNode* root) {
        if(!root) return 0;
        return 1+max(findMinimumInRotatedSortedArra(root->left),findMinimumInRotatedSortedArra(root->right));
    }
};