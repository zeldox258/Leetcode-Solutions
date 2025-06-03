
import java.util.*;
class Solution {
    public String rearrangeString(String s, int k) {
        if (k==0) return s;
        int[] cnt=new int[26];
        for (char c:s.toCharArray()) cnt[c-'a']++;
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->b[1]-a[1]);
        for (int i=0;i<26;i++) if(cnt[i]>0) pq.offer(new int[]{i,cnt[i]});
        StringBuilder sb=new StringBuilder();
        while (!pq.isEmpty()) {
            List<int[]> tmp=new ArrayList<>();
            for (int i=0;i<k;i++) {
                if (pq.isEmpty()&&sb.length()<s.length()) return "";
                if (pq.isEmpty()) break;
                int[] top=pq.poll(); sb.append((char)('a'+top[0]));
                if (--top[1]>0) tmp.add(top);
            }
            pq.addAll(tmp);
        }
        return sb.length()==s.length()?sb.toString():"";
    }
}
