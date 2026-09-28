class Solution {
    public boolean isPalindrome(String s) {
       String k=s.toLowerCase().replaceAll("[^a-z0-9]","");
          int i=0;
        int j=k.length()-1;
        while(i<j){
            if(k.charAt(i)!=k.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
        
    }
}
