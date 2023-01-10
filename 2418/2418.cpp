class Solution {
public:
    int sortThePeople(TreeNode* root) {
        if(!root) return 0;
        return 1+max(sortThePeople(root->left),sortThePeople(root->right));
    }
};