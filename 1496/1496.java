class Solution {
    public boolean isPathCrossing(String path) {
        Map<String,Integer> map = new HashMap<>();
        StringBuilder str = new StringBuilder();
        str.append(0+" "+0);
        map.put(str.toString(),1);
        int x = 0;
        int y = 0;
        for(int i = 0;i<path.length();i++){
            //System.out.println("set size"+set.size());
            switch(path.charAt(i)){
                case 'N':y++;break;
                case 'S':y--;break;
                case 'E':x++;break;
                case 'W':x--;break;
            }
            //System.out.println(x+" "+y);
            str = new StringBuilder();
            str.append(x+" "+y);
            //System.out.println(temp[0]+" "+temp[1]);
            if(map.containsKey(str.toString())) return true;
            map.put(str.toString(),1);
        }
        
        return false;
        
    }
}