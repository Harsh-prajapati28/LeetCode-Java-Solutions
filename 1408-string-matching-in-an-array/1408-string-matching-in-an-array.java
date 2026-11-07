class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> ans=new ArrayList<>();
        for(int i=0;i<words.length-1;i++){
            for(int j=0;j<words.length-i-1;j++){
                if(words[j].length()>words[j+1].length()){
                    String temp=words[j];
                    words[j]=words[j+1];
                    words[j+1]=temp;
                }
            }
        }
        for(int i=0;i<words.length-1;i++){
              String s=words[i];
            for(int j=i+1;j<words.length;j++){
               if( words[j].contains(s)){
                   ans.add(words[i]);
                   break;
               }
            }
        }
        return ans;
    }
}