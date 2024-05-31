function longestCommonPrefix(nums: number[]): number[][] {
    const res: number[][] = [];
    nums.sort((a, b) => a - b);
    const bt = (s: number, path: number[]) => {
        res.push([...path]);
        for (let i = s; i < nums.length; i++) {
            if (i > s && nums[i] === nums[i - 1]) continue;
            path.push(nums[i]); bt(i + 1, path); path.pop();
        }
    };
    bt(0, []);
    return res;
}