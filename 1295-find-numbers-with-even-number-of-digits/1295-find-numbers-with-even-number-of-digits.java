class Solution {
    public int findNumbers(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int j=nums[i];
            int digits=0;
            while(j>0){
                digits++;
                j=j/10;
            }
            if(digits%2==0){
                ans++;
            }
        }
        return ans;
    }
}