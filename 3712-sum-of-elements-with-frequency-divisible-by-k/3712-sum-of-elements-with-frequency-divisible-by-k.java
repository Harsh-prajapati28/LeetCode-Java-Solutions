class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int[] freq=new int[100];
        for(int i=0;i<nums.length;i++){
            int ind=nums[i]-1;
            freq[ind]++;
        }
        int sum=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]%k==0){
                sum+=freq[i]*(i+1);
            }
        }
        return sum;
    }
}