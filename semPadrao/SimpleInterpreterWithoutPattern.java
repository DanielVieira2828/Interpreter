public class SimpleInterpreterWithoutPattern {

    public static int evaluate(String expression) {
        String[] tokens = expression.split(" ");
        int result = Integer.parseInt(tokens[0]);

        for (int i = 1; i < tokens.length; i += 2) {
            String operator = tokens[i];
            int number = Integer.parseInt(tokens[i + 1]);

            if (operator.equals("+")) {
                result += number;
            } else if (operator.equals("-")) {
                result -= number;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String expression = "5 + 3 - 2";
        System.out.println(expression + " = " + evaluate(expression));  // Output: 6
    }
}
