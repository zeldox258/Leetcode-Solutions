
class Solution {
    public String alphabetBoardPath(String target) {
        String[] board={"abcde","fghij","klmno","pqrst","uvwxy","z"};
        Map<Character,int[]> pos=new HashMap<>();
        for(int i=0;i<board.length;i++) for(int j=0;j<board[i].length();j++) pos.put(board[i].charAt(j),new int[]{i,j});
        StringBuilder sb=new StringBuilder();
        int cr=0,cc=0;
        for(char c:target.toCharArray()){
            int[] p=pos.get(c);
            int dr=p[0]-cr,dc=p[1]-cc;
            if(dr<0) for(int i=0;i<-dr;i++) sb.append('U');
            if(dc<0) for(int i=0;i<-dc;i++) sb.append('L');
            if(dc>0) for(int i=0;i<dc;i++) sb.append('R');
            if(dr>0) for(int i=0;i<dr;i++) sb.append('D');
            sb.append('!'); cr=p[0]; cc=p[1];
        }
        return sb.toString();
    }
}
