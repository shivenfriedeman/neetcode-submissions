class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prx = new int[nums.length];
        int[] sfx = new int[nums.length];
        int[] res = new int[nums.length];

        prx[0] = 1;
        sfx[sfx.length - 1] = 1;

        for(int i = 1; i < nums.length; i ++){
            prx[i] = prx[i-1] * nums[i-1];
        }

        for(int i = nums.length - 2; i >= 0; i --){
            sfx[i] = sfx[i+1] * nums[i+1];
        }

        for(int i = 0; i < nums.length; i ++){
            res[i] = prx[i] * sfx[i]; 
        }

        return res;
    }
}  
