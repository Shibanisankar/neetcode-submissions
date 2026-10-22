class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        Integer res = Integer.parseInt(tokens[0]);
        Set<String> operators = Set.of("+", "-", "*", "/");
        for (int i = 0; i < tokens.length; i++) {
            if (operators.contains(tokens[i])) {
                Integer b = stack.pop();
                Integer a = stack.pop();
                switch (tokens[i]) {
                    case "+" -> res = a + b;
                    case "-" -> res = a - b;
                    case "*" -> res = a * b;
                    case "/" -> res = b == 0 ? 0 : a / b;
                }
                stack.push(res);
            } else {
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return res;
    }
}
