class Solution {
    public int findClosest(int x, int y, int z) {
        int ans = 0;
        
        int person1 = Math.abs(z-x);
        int person2 = Math.abs(z-y);
        
        if(person1<person2) return 1;
        else if(person1>person2) return 2;
        return 0;
    }
}