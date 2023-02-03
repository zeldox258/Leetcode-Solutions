
class CombinationIterator {
    List<String> list=new ArrayList<>();
    int idx=0;
    public CombinationIterator(String characters, int combinationLength) {
        int n=characters.length();
        for(int mask=0;mask<(1<<n);mask++){
            if(Integer.bitCount(mask)==combinationLength){
                StringBuilder sb=new StringBuilder();
                for(int i=0;i<n;i++) if((mask>>(n-1-i)&1)==1) sb.append(characters.charAt(i));
                list.add(sb.toString());
            }
        }
        Collections.sort(list);
    }
    public String next(){ return list.get(idx++); }
    public boolean hasNext(){ return idx<list.size(); }
}
