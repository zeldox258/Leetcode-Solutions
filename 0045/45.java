class Solution {
    public int jump(int[] nums) {
        int jump =0;
        int reach =0;
        int e = 0;
        if(nums.length<2){
            return 0;
        }
        for(int i=0;i<nums.length;i++){
            reach = Math.max(reach,i+nums[i]);
            if(i==e){

               jump++;
               e=reach;
               if(e>=nums.length-1){
                break;
               }
            }

        }

        return jump;

    }
}