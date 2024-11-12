public class ShuntingYard {

    public ShuntingYard(){

    }

    public static char[] breakDownString(String s) {
        return s.toCharArray();//turn string into array of characters

    }
//checks if each char is an operator or not
    public boolean isOperator(char ch) {
        if(ch == '+' || ch == '-' || ch == '*' || ch == '/') {
            return true;
        }

        return false;
    }
//checks the precedence of the operators
    public int precedence(char op) {
        if (op == '(' || op == ')') {
            return 0;
        }
        if (op == '+' || op == '-') {
            return 1;
        } else if (op == '*' || op == '/') {
            return 2;
        }
        return -1; // Not an operator
    }
//main sorting method
    public String sorting(char ch[]) {
        String postFix = "";
        LinkedListStack stack = new LinkedListStack();
        int n = ch.length - 1;

        for (int i = 0; i < ch.length; i++) {
            char c = ch[i]; //use each element as a single char

            if (Character.isLetterOrDigit(c)) { // letters
                postFix += c; //auto added to the postfix string
            } else if (isOperator(c)) { // operators
                // pop operators from the stack while they have higher or equal precedence
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(c)) {
                    postFix += stack.pop();
                }
                stack.push(c);
            }
        }

        // Pop remaining operators in the stack
        while (!stack.isEmpty()) {
            postFix += stack.pop();
        }

        return postFix;
    }

}



