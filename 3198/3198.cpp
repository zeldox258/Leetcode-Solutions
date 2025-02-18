class Solution {
public:
    int findCitiesInEachState(TreeNode* root) {
        if(!root) return 0;
        return 1+max(findCitiesInEachState(root->left),findCitiesInEachState(root->right));
    }
};