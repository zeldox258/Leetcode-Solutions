class Solution {
public:
    int numberOfBeautifulPartitions(TreeNode* root) {
        if(!root) return 0;
        return 1+max(numberOfBeautifulPartitions(root->left),numberOfBeautifulPartitions(root->right));
    }
};