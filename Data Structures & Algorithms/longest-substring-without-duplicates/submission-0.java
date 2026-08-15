class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();

        int left = 0;
        int maxUnique = 0;

        for(int r = 0; r < s.length(); r ++){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(left));
                left ++;
                //what to do with max
            }
            set.add(s.charAt(r));
            maxUnique = Math.max(maxUnique, r - left + 1);
        }
        return maxUnique;
    }
}
