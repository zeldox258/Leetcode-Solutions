class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> solve1799(int[] nums) {
        Arrays.sort(nums);
        bt(nums,0,new ArrayList<>());
        return res;
    }
    void bt(int[] nums,int s,List<Integer> path){
        res.add(new ArrayList<>(path));
        for(int i=s;i<nums.length;i++){
            if(i>s&&nums[i]==nums[i-1]) continue;
            path.add(nums[i]);bt(nums,i+1,path);path.remove(path.size()-1);
        }
    }
}