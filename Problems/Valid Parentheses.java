

class Solution {
    public boolean isValid(String s) {
        if (s.isEmpty() || s.isBlank()) {
            return true;
        } 
        
        Stack<Character> stack = new Stack<>();
        char[] sequence = s.toCharArray();
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        
        for (int i = 0; i < sequence.length; i++) {
            if (sequence[i] == '(' || sequence[i] == '[' || sequence[i] == '{') {
                stack.push(sequence[i]);
            } else if (stack.isEmpty() || stack.pop() != map.get(sequence[i])) {
                return false;
            }
        }
        
        return stack.isEmpty();

    }
}
