
class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        List<List<String>> res=new ArrayList<>();
        String prefix="";
        for(char c:searchWord.toCharArray()){
            prefix+=c;
            List<String> list=new ArrayList<>();
            int lo=lowerBound(products,prefix);
            for(int i=lo;i<Math.min(lo+3,products.length)&&products[i].startsWith(prefix);i++) list.add(products[i]);
            res.add(list);
        }
        return res;
    }
    int lowerBound(String[] a,String t){int lo=0,hi=a.length;while(lo<hi){int m=(lo+hi)/2;if(a[m].compareTo(t)<0)lo=m+1;else hi=m;}return lo;}
}
