
import java.util.*;
class RandomizedSet {
    Map<Integer,Integer> map=new HashMap<>(); List<Integer> list=new ArrayList<>(); Random rand=new Random();
    public boolean insert(int val){if(map.containsKey(val))return false;map.put(val,list.size());list.add(val);return true;}
    public boolean remove(int val){
        if(!map.containsKey(val))return false;
        int idx=map.get(val),last=list.get(list.size()-1);
        list.set(idx,last); map.put(last,idx); list.remove(list.size()-1); map.remove(val); return true;
    }
    public int getRandom(){return list.get(rand.nextInt(list.size()));}
}
