class CustomStack {
    List<Integer> list = new ArrayList<>();
    int maxnumber =0;
    int index = -1;
    public CustomStack(int maxSize) {
        maxnumber = maxSize;
    }

    public void push(int x) {
        if(list.size() != maxnumber ){
            list.add(x);
            index++;
        }
    }

    public int pop() {
        if(list.size() >0){
            int a = list.get(index);
            list.remove(index--);
            return a;
        }
        return -1;
    }

    public void increment(int k, int val) {
         List<Integer> list1 = new ArrayList<>();
        for(int i =0;i<list.size();i++){
            if(i < k) list1.add(list.get(i)+val);
            else list1.add(list.get(i));
        }
        list.clear();
        for(int i =0;i<list1.size();i++){
            list.add(list1.get(i));
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */