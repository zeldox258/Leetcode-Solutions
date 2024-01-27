class Solution {
public:
    int splitAStringIntoTheMaxNumberOf(TreeNode* root) {
        if(!root) return 0;
        return 1+max(splitAStringIntoTheMaxNumberOf(root->left),splitAStringIntoTheMaxNumberOf(root->right));
    }
};