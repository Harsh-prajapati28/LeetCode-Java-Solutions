class Solution {
    public int heightChecker(int[] heights) {
        int n=heights.length;
        int[] expected=new int[n];
        for(int i=0;i<heights.length;i++){
            expected[i]=heights[i];
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(expected[j]>expected[j+1]){
                    int temp=expected[j];
                    expected[j]=expected[j+1];
                    expected[j+1]=temp;
                }
            }
        }
        int ans=0;
        for(int i=0;i<n;i++){
            if(expected[i]!=heights[i]){
                ans++;
            }
        }
        return ans;
    }
}