
class Solution {
    int[] parent;
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        int n=s.length();
        parent=new int[n];
        for(int i=0;i<n;i++) parent[i]=i;
        for(List<Integer> p:pairs){ int a=find(p.get(0)),b=find(p.get(1)); if(a!=b)parent[a]=b; }
        Map<Integer,List<Integer>> groups=new HashMap<>();
        for(int i=0;i<n;i++) groups.computeIfAbsent(find(i),k->new ArrayList<>()).add(i);
        char[] res=new char[n];
        for(List<Integer> idx:groups.values()){
            List<Character> chars=new ArrayList<>();
            for(int i:idx) chars.add(s.charAt(i));
            Collections.sort(idx); Collections.sort(chars);
            for(int i=0;i<idx.size();i++) res[idx.get(i)]=chars.get(i);
        }
        return new String(res);
    }
    int find(int x){return parent[x]==x?x:(parent[x]=find(parent[x]));}
}
