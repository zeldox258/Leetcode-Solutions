
class Solution {
    public int numTimesAllBlue(int[] light) {
        int max=0,count=0,res=0;
        for(int i=0;i<light.length;i++){
            max=Math.max(max,light[i]);
            count++;
            if(max==count) res++;
        }
        return res;
    }
}
