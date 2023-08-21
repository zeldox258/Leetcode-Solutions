
class Solution {
    public int numSquarefulPerms(int[] nums) {
        int n=nums.length; java.util.Arrays.sort(nums); int[]res=new int[1]; boolean[]used=new boolean[n]; permute(nums,used,new int[0],res,n); return res[0];
    }
    void permute(int[]nums,boolean[]used,int[]path,int[]res,int n){
        if(path.length==n){res[0]++;return;}
        for(int i=0;i<n;i++){if(used[i])continue;if(i>0&&nums[i]==nums[i-1]&&!used[i-1])continue;if(path.length>0){int s=path[path.length-1]+nums[i];int sq=(int)Math.sqrt(s);if(sq*sq!=s)continue;}used[i]=true;int[]np=java.util.Arrays.copyOf(path,path.length+1);np[path.length]=nums[i];permute(nums,used,np,res,n);used[i]=false;}
    }
}
