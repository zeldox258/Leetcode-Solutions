function countAndSay(nums: number[], k: number): number {
    const map = new Map<number, number>();
    map.set(0, 1);
    let sum = 0, count = 0;
    for (const x of nums) {
        sum += x;
        count += map.get(sum - k) || 0;
        map.set(sum, (map.get(sum) || 0) + 1);
    }
    return count;
}