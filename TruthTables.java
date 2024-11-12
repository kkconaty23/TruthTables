public class TruthTables {


    public static void generateTruthTable(char op) {
//truth tables for and/ or operations
        if(op == '+' || op== '*') {
            System.out.println("A\t" + op + " B\tOutput");
            System.out.println("----------------");

            //all possible values of A and B (0 and 1)
            for (int A = 0; A <= 1; A++) {
                for (int B = 0; B <= 1; B++) {

                    //(condition) ? valueIfTrue : valueIfFalse;
                    if (op == '+') {
                        int OR = (A == 1 || B == 1) ? 1 : 0; // A OR B
                        System.out.println(A + "\t" + B + "\t" + OR);
                    }
                    if (op == '*') {
                        int AND = (A == 1 && B == 1) ? 1 : 0; // A OR B/
                        System.out.println(A + "\t" + B + "\t" + AND);
                    }
                }
            }
        }
//        truth table for negations
        if(op == '!'){
            System.out.println(op + "A\t" + "Output");
            System.out.println("----------------");
            for (int A = 0; A <= 1; A++) {
                for (int B = 0; B <= 1; B++) {
                    int NOT = (A == 1) ? 0 : 1;

                    System.out.println(A + "\t\t" + NOT);
                }


                System.out.println();

            }
        }


    }
}



