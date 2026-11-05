class Solution {
    public void getSubSets(int[] nums,int i,List<Integer>list1,List<List<Integer>>ans){
        if(i==nums.length){
            ans.add(new ArrayList<>(list1));
            return;
        }
        list1.add(nums[i]);
        getSubSets(nums,i+1,list1,ans);
        list1.remove(list1.size()-1);
        getSubSets(nums,i+1,list1,ans);


    }
    public List<List<Integer>> subsets(int[] nums) {
        int i=0;
        List<Integer> list1=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        getSubSets(nums,i,list1,ans);
        return ans;
    }
}