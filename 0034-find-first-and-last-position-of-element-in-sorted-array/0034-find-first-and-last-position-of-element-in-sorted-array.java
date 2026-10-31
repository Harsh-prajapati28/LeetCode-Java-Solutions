class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] ans=new int[2];
        int start=0;
        int end=nums.length-1;
        int lowerBound=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                lowerBound=mid;
                end=mid-1;
            }
            else if(nums[mid]>target){
                 end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        ans[0]=lowerBound;
        start=0;
        end=nums.length-1;
        int upperBound=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                upperBound=mid;
                start=mid+1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            
        }
        ans[1]=upperBound;
        return ans;


    }
}