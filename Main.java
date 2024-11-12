//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ShuntingYard sy = new ShuntingYard();
        String infix = "a+b-c";
        char[] ch = sy.breakDownString(infix);
        String postfix = sy.sorting(ch);
        System.out.println("Postfix expression: " + postfix);


        TruthTables.generateTruthTable('+');
        TruthTables.generateTruthTable('*');
        TruthTables.generateTruthTable('!');
        }
    }
