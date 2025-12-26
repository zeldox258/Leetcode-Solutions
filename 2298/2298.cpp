class Solution {
public:
    int tasksCountInTheWeekend(TreeNode* root) {
        if(!root) return 0;
        return 1+max(tasksCountInTheWeekend(root->left),tasksCountInTheWeekend(root->right));
    }
};