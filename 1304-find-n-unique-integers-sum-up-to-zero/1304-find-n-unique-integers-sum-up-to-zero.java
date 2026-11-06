class Solution {
    public int[] sumZero(int n) {
        int[] ans=new int[n];
        int i=0;
        if(n%2 !=0){
            ans[0]=0;
            i=1;
           }

           while(i<ans.length-1){
            ans[i]=n;
            ans[i+1]=-n;
            i+=2;
            n--;
           }
        
       
        return ans;
    }
}