class Solution {
    public boolean isValid(String s) {
        int slen = s.length();
        Stack<Character> stck = new Stack<>();

        if(slen % 2 == 1) return false;

        for(int i = 0; i < slen; i ++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                stck.push(s.charAt(i));
            } else {
                if(stck.isEmpty()) return false;
                if(s.charAt(i) == ')' && stck.pop() != '(') return false; 
                if(s.charAt(i) == ']' && stck.pop() != '[') return false;
                if(s.charAt(i) == '}' && stck.pop() != '{') return false;
            }
            
            
        }
        return stck.isEmpty();
        
    }
}
