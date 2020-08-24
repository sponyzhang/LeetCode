class Solution {
    public boolean isValid(String s) {
        Stack stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case '(':
                case '{':
                case '[': stack.push(c); break;
                case ')': if (stack.empty() || (char) stack.pop() != '(') return false; else break;
                case '}': if (stack.empty() || (char) stack.pop() != '{') return false; else break;
                case ']': if (stack.empty() || (char) stack.pop() != '[') return false; else break;
                default: System.out.println("error");
            }
        }
        if (stack.empty()) {
            return true;
        } else {
            return false;
        }
    }
}
