import java.util.*;
class Vector2D {
    private List<Integer> flat=new ArrayList<>();private int idx=0;
    public Vector2D(int[][] vec){for(int[] row:vec)for(int x:row)flat.add(x);}
    public int next(){return flat.get(idx++);}
    public boolean hasNext(){return idx<flat.size();}
}