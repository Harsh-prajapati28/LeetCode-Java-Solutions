class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()>haystack.length()){
            return -1;
        }
      for(int i=0;i<haystack.length();i++){
        int j=0;
        int k=i;
        while(j<needle.length() && k<haystack.length()){
            if(haystack.charAt(k)!=needle.charAt(j)){
                break;
            }
            j++;
            k++;   
        }
        if(j==needle.length()){
             return i;
        }
       
      }
      return -1;
    }
}