class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // Arrays.sort(piles); <- adds uneeded runtime
        int lo = 1; //lowest posstible b/t
        int hi = 0;
        for(int pile : piles){
            if(pile > hi){ hi = pile; }
        } //highest possible b/t
        int min = hi; //start with the highest, decrease as we discover

        while(lo <= hi){ //once we reach this case, we have found the min b/t
            //middle of current window of values
            int k = (hi + lo) / 2;

            //total time for current b/t
            long totalTime = 0;

            //go through each pile determining length for given bananas/time
            for(int pile : piles){
                totalTime += Math.ceil((double) pile / k);
            }

            if(totalTime <= h){ // if totaltime is less than alotted time, 
                                // we can try to explore a b/t rate bigger 
                min = k;
                hi = k - 1;
            } else {
                lo = k + 1;
            }
        }
        return min;
    }
    
}
