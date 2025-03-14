function superUglyNumber(nums: number[], k: number): number {
    const sorted = [...nums].sort((a, b) => a - b);
    return sorted[sorted.length - k];
}