class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int ans=-1;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue().equals(entry.getKey()) && ans<entry.getKey()){
                ans=entry.getKey();
            }
        }
        return ans;
    }
}