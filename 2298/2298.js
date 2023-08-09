/**
 * @param {TreeNode} root
 * @return {number}
 */
var tasksCountInTheWeekend = function(root) {
    if (!root) return 0;
    return 1 + Math.max(tasksCountInTheWeekend(root.left), tasksCountInTheWeekend(root.right));
};