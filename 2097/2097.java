class Solution {
    public int[][] validArrangement(int[][] pairs) {
        Map<Integer,ArrayList<Integer>> map = new HashMap<>();
        Map<Integer,Integer> map2 = new HashMap<>();

        for(int i=0;i<pairs.length;i++){
            if(!map.containsKey(pairs[i][0])){
                ArrayList<Integer> arr = new ArrayList<>();
                arr.add(pairs[i][1]);
                map.put(pairs[i][0], arr);
            }else{
                ArrayList<Integer> arr = map.get(pairs[i][0]);
                arr.add(pairs[i][1]);
                map.put(pairs[i][0], arr);
            }

            map2.put(pairs[i][0], map2.getOrDefault(pairs[i][0], 0)+1);
            map2.put(pairs[i][1], map2.getOrDefault(pairs[i][1], 0)-1);
        }

        int start=pairs[0][0];
        for(Map.Entry<Integer, Integer> entry: map2.entrySet()){
            if(entry.getValue()==1){
                start=entry.getKey();
                break;
            }
        }

        Stack<Integer> st = new Stack<>();
        st.push(start);
        ArrayList<Integer> list = new ArrayList<>();

        while(!st.isEmpty()){
            int num = st.peek();
            while(map.containsKey(num) && map.get(num).size()>0){
                int size = map.get(num).size();
                int val = map.get(num).get(size-1);
                ArrayList<Integer> arr = map.get(num);
                arr.remove(size-1);
                map.put(num, arr);
                st.add(val);
                num=val;
            }

            int x=st.peek();
            st.pop();
            list.add(x);
        }

        Collections.reverse(list);
        int[][] ans = new int[pairs.length][pairs[0].length];
        int n = list.size()-1;

        for(int i=0;i<n;i++){
            ans[i][0]=list.get(i);
            ans[i][1]=list.get(i+1);
        }


        return ans;
    }
}