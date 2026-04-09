class Solution {
    public int trap(int[] height) {
        int l=0,r=height.length-1,lmax=0,rmax=0,water=0;
        while(l<r){
            if(height[l]<height[r]){if(height[l]>=lmax)lmax=height[l];else water+=lmax-height[l];l++;}
            else{if(height[r]>=rmax)rmax=height[r];else water+=rmax-height[r];r--;}
        }
        return water;
    }
}