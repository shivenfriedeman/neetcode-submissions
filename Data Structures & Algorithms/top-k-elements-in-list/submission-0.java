class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();

        // Map number to frequency
        for(int num : nums){
            if(!hm.containsKey(num)){
                hm.put(num, 0);
            }
            hm.put(num, hm.get(num) + 1);
        }

        // each index is the frequency
        List<Integer>[] buckets = new ArrayList[nums.length + 1];

        for(int num : hm.keySet()){
            if(buckets[hm.get(num)] == null){
                buckets[hm.get(num)] = new ArrayList<>();
            }
            buckets[hm.get(num)].add(num);
        }
        
        int[] ret = new int[k];
        int index = 0;
        for(int i = nums.length; i >= 0; i --){
            if(buckets[i] != null){
                for(int num : buckets[i]){
                    ret[index] = num;
                    index ++;
                    if(index == k){
                        return ret;
                    }
                }
            }
        }
        return ret;



    }
}
