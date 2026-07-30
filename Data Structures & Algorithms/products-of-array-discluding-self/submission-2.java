class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prx = new int[n];
        int[] sfx = new int[n];
        int[] res = new int[n];

        prx[0] = 1;
        sfx[sfx.length - 1] = 1;

        for(int i = 1; i < n; i ++){
            prx[i] = prx[i-1] * nums[i-1];
        }

        for(int i = n - 2; i >= 0; i --){
            sfx[i] = sfx[i+1] * nums[i+1];
        }

        for(int i = 0; i < n; i ++){
            res[i] = prx[i] * sfx[i]; 
        }

        return res;
    }
}  
