/**
 * @param {TreeNode} root
 * @return {number}
 */
var managerOfTheLargestDepartment = function(root) {
    if (!root) return 0;
    return 1 + Math.max(managerOfTheLargestDepartment(root.left), managerOfTheLargestDepartment(root.right));
};