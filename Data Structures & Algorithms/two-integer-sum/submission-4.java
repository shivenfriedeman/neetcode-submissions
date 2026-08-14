class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap<>(); //num to index

        int[] ret = new int[2];
        for(int i = 0; i < nums.length; i ++){
            if(hm.containsKey(nums[i])){
                ret[0] = Math.min(i, hm.get(nums[i]));
                ret[1] = Math.max(i, hm.get(nums[i]));
                return ret;
            } else {
                hm.put(target - nums[i], i);
            }
        }
        return ret;
    }
}
