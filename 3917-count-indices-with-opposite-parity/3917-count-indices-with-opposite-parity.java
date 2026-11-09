class Solution {
    public int[] countOppositeParity(int[] nums) {
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length-1;i++){
            int count=0;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]%2 != nums[i]%2) count++;
            }
            ans[i]=count;
        }
        ans[nums.length-1]=0;
        return ans;
    }
}