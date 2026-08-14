class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // go through each element, turn into char arr and sort
        // arrays with matching elements are anagrams

        Map<String, List<String>> hm = new HashMap<>();
        for(int i = 0; i < strs.length; i ++){
            char[] sortA = strs[i].toCharArray();
            Arrays.sort(sortA);
            String sorted = new String(sortA);
            if(!hm.containsKey(sorted)){
                hm.put(sorted, new ArrayList<String>());
            }
            hm.get(sorted).add(strs[i]);
        }

        List<List<String>> ret = new ArrayList<>();
        for(String key : hm.keySet()){
            ret.add(hm.get(key));
        }

        return ret;

    }
}
