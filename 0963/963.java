
class Solution {
    public double minAreaFreeRect(int[][] points) {
        int n=points.length; java.util.Map<String,java.util.List<int[]>> map=new java.util.HashMap<>();
        for(int i=0;i<n;i++) for(int j=i+1;j<n;j++){int cx=points[i][0]+points[j][0],cy=points[i][1]+points[j][1];long d=(long)(points[i][0]-points[j][0])*(points[i][0]-points[j][0])+(long)(points[i][1]-points[j][1])*(points[i][1]-points[j][1]);String key=cx+","+cy+","+d;map.computeIfAbsent(key,k->new java.util.ArrayList<>()).add(new int[]{i,j});}
        double res=Double.MAX_VALUE;
        for(java.util.List<int[]> list:map.values()) for(int i=0;i<list.size();i++) for(int j=i+1;j<list.size();j++){int[]p1=list.get(i),p2=list.get(j);int[]A=points[p1[0]],B=points[p1[1]],C=points[p2[0]];long dot=(long)(B[0]-A[0])*(C[0]-A[0])+(long)(B[1]-A[1])*(C[1]-A[1]);if(dot==0){double area=Math.sqrt((double)(B[0]-A[0])*(B[0]-A[0])+(double)(B[1]-A[1])*(B[1]-A[1]))*Math.sqrt((double)(C[0]-A[0])*(C[0]-A[0])+(double)(C[1]-A[1])*(C[1]-A[1]));res=Math.min(res,area);}}
        return res==Double.MAX_VALUE?0:res;
    }
}
