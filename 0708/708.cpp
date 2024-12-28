class Solution {
public:
    int insertIntoASortedCircularLinke(TreeNode* root) {
        if(!root) return 0;
        return 1+max(insertIntoASortedCircularLinke(root->left),insertIntoASortedCircularLinke(root->right));
    }
};