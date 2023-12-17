function maximizeSum(nums: number[], k: number): number {
    let max: number = Math.max(...nums);
    let result: number = max;
    for (let i = 1; i < k; i++) {
        result += ++max;
    }
    return result;
};