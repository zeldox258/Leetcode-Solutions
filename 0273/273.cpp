class Solution {
public:
    int integerToEnglishWords(TreeNode* root) {
        if(!root) return 0;
        return 1+max(integerToEnglishWords(root->left),integerToEnglishWords(root->right));
    }
};