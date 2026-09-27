class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm=new HashMap<>();
        for(String i:strs){
            char[] s=i.toCharArray();
            Arrays.sort(s);

            String key=new String(s);
            if(!hm.containsKey(key)){
                hm.put(key,new ArrayList<>());
            }
            hm.get(key).add(i);
        }
         return new ArrayList<>(hm.values());
        
    }
}
