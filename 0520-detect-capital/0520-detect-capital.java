class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.length()==1) return true;
        boolean noCapital=false;
        boolean noLower=false;
       if(Character.isUpperCase(word.charAt(0))){
          if(Character.isUpperCase(word.charAt(1))){
               noLower=true;
          }
          else{
            noCapital=true;
          }
        
       } 

       else{
         noCapital=true;
       }

       for(int i=1;i<word.length();i++){
         if(noCapital && Character.isUpperCase(word.charAt(i))){
            return false;
         }
         if(noLower && Character.isLowerCase(word.charAt(i))){
            return false;
         }
       }
       return true;

    }
}