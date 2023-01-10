
class Solution {
    public List<String> printVertically(String s) {
        String[] words=s.split(" ");
        int max=0; for(String w:words) max=Math.max(max,w.length());
        List<String> res=new ArrayList<>();
        for(int i=0;i<max;i++){
            StringBuilder sb=new StringBuilder();
            for(String w:words) sb.append(i<w.length()?w.charAt(i):' ');
            int end=sb.length()-1;
            while(sb.charAt(end)==' ') end--;
            res.add(sb.substring(0,end+1));
        }
        return res;
    }
}
