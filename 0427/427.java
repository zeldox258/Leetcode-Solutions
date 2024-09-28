
class Solution {
    public Node construct(int[][] grid) {
        return build(grid,0,0,grid.length);
    }
    Node build(int[][] grid,int r,int c,int len){
        if(len==1) return new Node(grid[r][c]==1,true);
        int half=len/2;
        Node tl=build(grid,r,c,half),tr=build(grid,r,c+half,half),bl=build(grid,r+half,c,half),br=build(grid,r+half,c+half,half);
        if(tl.isLeaf&&tr.isLeaf&&bl.isLeaf&&br.isLeaf&&tl.val==tr.val&&tr.val==bl.val&&bl.val==br.val) return new Node(tl.val,true);
        return new Node(false,false,tl,tr,bl,br);
    }
}
