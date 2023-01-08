class Solution {
public:
    int sortItemsByGroupsRespectingDep(TreeNode* root) {
        if(!root) return 0;
        return 1+max(sortItemsByGroupsRespectingDep(root->left),sortItemsByGroupsRespectingDep(root->right));
    }
};