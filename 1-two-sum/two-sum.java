class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int res = target - nums[i];
            if(hmap.containsKey(res)){
                return new int[]{i,hmap.get(res)};
            }
            hmap.put(nums[i],i);
        }
        return new int[]{};
    }
}