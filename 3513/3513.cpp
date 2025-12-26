class Solution {
public:
    int numberOfUniqueXorTripletsI(TreeNode* root) {
        if(!root) return 0;
        return 1+max(numberOfUniqueXorTripletsI(root->left),numberOfUniqueXorTripletsI(root->right));
    }
};