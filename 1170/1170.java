
class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] qf=new int[queries.length],wf=new int[words.length];
        for(int i=0;i<queries.length;i++) qf[i]=f(queries[i]);
        for(int i=0;i<words.length;i++) wf[i]=f(words[i]);
        Arrays.sort(wf);
        int[] res=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int lo=0,hi=wf.length;
            while(lo<hi){int mid=(lo+hi)/2;if(wf[mid]<=qf[i])lo=mid+1;else hi=mid;}
            res[i]=wf.length-lo;
        }
        return res;
    }
    int f(String s){ char min='z'; int cnt=0; for(char c:s.toCharArray()){if(c<min){min=c;cnt=1;}else if(c==min)cnt++;} return cnt; }
}
