class Solution {
    public static final Character[][] array = {
        {'(', ')'}, {'[', ']'}, {'{', '}'}
    };

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            Character chr = Character.valueOf(s.charAt(i));
            
            if (stack.empty()) {
                stack.push(chr);
                continue;
            }

            Character lastOne = stack.peek();
            for (int j = 0; j < array.length; j++) {
                if (array[j][1] == chr) {
                    if (array[j][0] == lastOne) {
                        stack.pop();
                    } else {
                        stack.push(chr);
                    }
                    break;

                } else if (array[j][0] == chr) {
                    stack.push(chr);
                    break;
                }
            }
        }

        return stack.empty();
    }
}