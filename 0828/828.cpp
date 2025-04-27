class Solution {
public:
    int countUniqueCharactersOfAllSubs(TreeNode* root) {
        if(!root) return 0;
        return 1+max(countUniqueCharactersOfAllSubs(root->left),countUniqueCharactersOfAllSubs(root->right));
    }
};