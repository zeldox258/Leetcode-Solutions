
class NumArray {
    int[] tree, nums;
    int n;
    public NumArray(int[] nums) {
        this.n = nums.length; this.nums = nums.clone();
        tree = new int[n+1];
        for (int i = 0; i < n; i++) update(i, nums[i]);
    }
    public void update(int i, int val) {
        int diff = val - nums[i]; nums[i] = val;
        for (int pos = i+1; pos <= n; pos += pos&(-pos)) tree[pos] += diff;
    }
    public int sumRange(int l, int r) { return query(r+1) - query(l); }
    int query(int i) { int s=0; for(;i>0;i-=i&(-i)) s+=tree[i]; return s; }
}
