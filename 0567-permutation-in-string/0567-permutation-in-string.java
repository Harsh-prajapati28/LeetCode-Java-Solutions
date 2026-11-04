class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        
        int[] freq=new int[26];
        for(int i=0;i<s1.length();i++){
            int ch=s1.charAt(i)-'a';
            freq[ch]++;
        }
        int i=0;
        int j=s1.length()-1;
        int [] freq2=new int[26];
        while(j<s2.length()){
            for(int k=i;k<=j;k++){
                
                   int ch=s2.charAt(k)-'a';
                freq2[ch]++; 
                
                
            }
            if(Arrays.equals(freq,freq2)) return true;
         
             for(int t=0;t<freq2.length;t++){
                freq2[t]=0;
             }
        
            i++;
            j++;
        }
        return false;
    }
}