class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            Character inputOne = Character.valueOf(s.charAt(i));
            
            if (stack.empty()
                || inputOne == '(' || inputOne == '[' || inputOne == '{') {
                stack.push(inputOne);
                continue;
            }

            Character lastOne = stack.peek();
            
            if (match(inputOne, lastOne)) {
                stack.pop();
            } else {
                stack.push(inputOne);
            }
        }

        return stack.empty();
    }

    private boolean match(Character inputOne, Character lastOne) {
        return (lastOne == '(' && inputOne == ')')
                || (lastOne == '[' && inputOne == ']')
                || (lastOne == '{' && inputOne == '}');
    }
}