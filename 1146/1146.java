
class SnapshotArray {
    private List<int[]>[] data;
    private int snapId=0;
    public SnapshotArray(int length){
        data=new List[length];
        for(int i=0;i<length;i++){data[i]=new ArrayList<>();data[i].add(new int[]{0,0});}
    }
    public void set(int index,int val){
        List<int[]> list=data[index];
        if(list.get(list.size()-1)[0]==snapId) list.get(list.size()-1)[1]=val;
        else list.add(new int[]{snapId,val});
    }
    public int snap(){ return snapId++; }
    public int get(int index,int snap_id){
        List<int[]> list=data[index];
        int lo=0,hi=list.size()-1;
        while(lo<hi){int mid=(lo+hi+1)/2;if(list.get(mid)[0]<=snap_id)lo=mid;else hi=mid-1;}
        return list.get(lo)[1];
    }
}
