class Solution {
    public int numSpecial(int[][] mat) {
        Map<Integer , Integer> rm = new HashMap<>();
        Map<Integer , Integer> cm = new HashMap<>();
        for(int i =0;i<mat.length;i++){
            for(int j = 0 ;j<mat[0].length; j++){
                if(mat[i][j] == 1){
                    rm.put(i,rm.getOrDefault(i,0)+1);
                    cm.put(j,cm.getOrDefault(j,0)+1);
                }
            }
        }
        int res = 0;
        for(int i =0;i<mat.length;i++){
            for(int j = 0 ;j<mat[0].length; j++){
                if(mat[i][j] == 1){
                    if(rm.get(i) ==1 && cm.get(j)==1)res++;
                }
            }
        }
        
        return res;
        
    }
}