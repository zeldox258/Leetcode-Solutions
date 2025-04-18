
import java.util.*;
class RandomizedCollection {
    Map<Integer,Set<Integer>> idx=new HashMap<>(); List<Integer> list=new ArrayList<>(); Random rand=new Random();
    public boolean insert(int val){boolean absent=!idx.containsKey(val)||idx.get(val).isEmpty();idx.computeIfAbsent(val,k->new LinkedHashSet<>()).add(list.size());list.add(val);return absent;}
    public boolean remove(int val){
        if(!idx.containsKey(val)||idx.get(val).isEmpty())return false;
        int removeIdx=idx.get(val).iterator().next(); idx.get(val).remove(removeIdx);
        int last=list.get(list.size()-1);
        if(removeIdx!=list.size()-1){list.set(removeIdx,last);idx.get(last).remove(list.size()-1);idx.get(last).add(removeIdx);}
        list.remove(list.size()-1); return true;
    }
    public int getRandom(){return list.get(rand.nextInt(list.size()));}
}
