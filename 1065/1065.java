
class Solution {
    public int[] indexPairs(String text, String[] words) {
        java.util.List<int[]> res=new java.util.ArrayList<>();
        for(String w:words){int idx=0;while((idx=text.indexOf(w,idx))!=-1){res.add(new int[]{idx,idx+w.length()-1});idx++;}}
        res.sort((a,b)->a[0]!=b[0]?a[0]-b[0]:a[1]-b[1]); return res.toArray(new int[0][]);
    }
}
