class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> k=new ArrayList<>();

        m(k,"",0,0,n);
        return k;
         
    }
    public void m(List<String> k,String curr,int open,int close,int n){
        if(curr.length()==2*n){
            k.add(curr);
            return;
        }
        if(open<n){
            m(k,curr+"(",open+1,close,n);
        }
        if(close<open){
            m(k,curr+")",open,close+1,n);
        }
    }
}
