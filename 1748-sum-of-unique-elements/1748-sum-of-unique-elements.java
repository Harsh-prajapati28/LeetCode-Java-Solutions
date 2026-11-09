class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
        int[] freq=new int[100];
        for(int i=0;i<nums.length;i++){
            int index=nums[i]-1;
            freq[index]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]==1){
                sum=sum+i+1;
            }
        }
        return sum;
    }
}