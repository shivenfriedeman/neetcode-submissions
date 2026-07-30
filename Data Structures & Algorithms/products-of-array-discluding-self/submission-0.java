class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int zeros = 0;
        for(int i = 0; i < nums.length; i ++){
            if(nums[i] != 0){
                product *= nums[i];
            } else {
                zeros += 1;
            }
        }

        int[] res = new int[nums.length];
        if(zeros > 1) return res;
        for(int i = 0; i < res.length; i ++){
            if(nums[i] == 0){
                res[i] = product;
            } else if(zeros == 0){
                res[i] = product/nums[i];
            } else {
                res[i] =0;
            }
        }

        return res;
    }
}  
