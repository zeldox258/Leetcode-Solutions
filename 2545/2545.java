class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        Map<Integer,int[]> mp=new TreeMap<>();
        for(int[] e:score)
            mp.put(e[k],e);
        List<int[]> lt=new LinkedList<>();
        for(int[] val:mp.values())
            lt.add(val);
        Collections.reverse(lt);
        return lt.toArray(new int[0][0]);
    }
}