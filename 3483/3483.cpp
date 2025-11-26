class Solution {
public:
    int unique3digitEvenNumbers(TreeNode* root) {
        if(!root) return 0;
        return 1+max(unique3digitEvenNumbers(root->left),unique3digitEvenNumbers(root->right));
    }
};