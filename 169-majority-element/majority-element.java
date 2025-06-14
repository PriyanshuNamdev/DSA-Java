class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int ans = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i<n;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }

        for(int key : map.keySet()){
            if(map.get(key) > n/2){
                ans = key;
            }
        }
        return ans;
    }
}