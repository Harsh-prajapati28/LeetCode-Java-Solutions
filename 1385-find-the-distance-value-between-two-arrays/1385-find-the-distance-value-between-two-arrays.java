class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int ans=arr1.length;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                int diff=arr1[i]-arr2[j];
                if(Math.abs(diff)<=d){
                    ans--;
                    break;
                }
            }
        }
        return ans;
    }
}