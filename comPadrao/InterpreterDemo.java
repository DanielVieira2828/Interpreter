package comPadrao;

public class InterpreterDemo {
    public static void main(String[] args) {
        // Interpretar a expressão: (5 + 3) - 2

        // Primeiro, criamos as expressões de números
        Expression five = new NumberExpression(5);
        Expression three = new NumberExpression(3);
        Expression two = new NumberExpression(2);

        // Agora criamos a expressão (5 + 3)
        Expression addition = new AddExpression(five, three);

        // Finalmente criamos a expressão completa (5 + 3) - 2
        Expression finalExpression = new SubtractExpression(addition, two);

        // Interpretar a expressão
        System.out.println("(5 + 3) - 2 = " + finalExpression.interpret());  // Output: 6
    }
}