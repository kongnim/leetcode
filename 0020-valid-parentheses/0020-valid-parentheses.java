class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char inputOne = s.charAt(i);
            
            if (stack.empty()
                || inputOne == '(' || inputOne == '[' || inputOne == '{') {
                stack.push(inputOne);
                continue;
            }

            if (match(inputOne, stack.peek())) {
                stack.pop();
            } else {
                stack.push(inputOne);
            }
        }

        return stack.empty();
    }

    private boolean match(char inputOne, char lastOne) {
        return (lastOne == '(' && inputOne == ')')
                || (lastOne == '[' && inputOne == ']')
                || (lastOne == '{' && inputOne == '}');
    }
}