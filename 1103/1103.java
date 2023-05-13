
class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] res = new int[num_people];
        int i=0, give=1;
        while(candies>0){
            res[i%num_people]+=Math.min(give,candies);
            candies-=give; give++; i++;
        }
        return res;
    }
}
