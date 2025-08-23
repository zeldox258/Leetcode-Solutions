import java.util.*;
class ZigzagIterator {
    private List<Integer> data=new ArrayList<>();private int idx=0;
    public ZigzagIterator(List<Integer> v1,List<Integer> v2){
        int i=0,j=0;
        while(i<v1.size()&&j<v2.size()){data.add(v1.get(i++));data.add(v2.get(j++));}
        while(i<v1.size()) data.add(v1.get(i++));
        while(j<v2.size()) data.add(v2.get(j++));
    }
    public int next(){return data.get(idx++);}
    public boolean hasNext(){return idx<data.size();}
}