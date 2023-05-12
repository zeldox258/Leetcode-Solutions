
class Solution {
    public List<Integer> pathInZigZagTree(int label) {
        LinkedList<Integer> res = new LinkedList<>();
        int level=1, sum=0;
        while((1<<level)<=label) level++;
        level--;
        while(label>=1){
            res.addFirst(label);
            int lo=1<<level, hi=(1<<(level+1))-1;
            label=(lo+hi-label)/2;
            level--;
        }
        return res;
    }
}
