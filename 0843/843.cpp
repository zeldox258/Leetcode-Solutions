class Solution {
public:
    int guessTheWord(TreeNode* root) {
        if(!root) return 0;
        return 1+max(guessTheWord(root->left),guessTheWord(root->right));
    }
};