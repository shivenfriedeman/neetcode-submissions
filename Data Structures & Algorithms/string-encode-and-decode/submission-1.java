class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty()) return "";

        StringBuilder res = new StringBuilder();
        for(String str : strs){
            res.append(str).append("ぁ");
        }

        return res.toString();
    }

    public List<String> decode(String str) {
        if(str.equals("")) return new ArrayList<>();

        List<String> res = new ArrayList<>();
        int prior = 0;
        for(int i = 0; i < str.length(); i ++){
            if(str.charAt(i) == 'ぁ'){
                res.add(str.substring(prior, i));
                prior = i + 1;
            }
        }
        
        return res;
    }
}
