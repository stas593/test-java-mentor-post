package com.company;

public class Culc {

        int res(String[] divided) {

            String op1 = divided[0];
            String op2 = divided[1];
            String op3 = divided[2];


            int Result = 0;
            int Operator1 = TypeCulc.GetOperator(op1);
            int Operator2 = TypeCulc.GetOperator(op3);

            if (op2.equals("+")) {
                Result = Operator1 + Operator2;
            }
            if (op2.equals("-")) {
                Result = Operator1 - Operator2;
            }
            if (op2.equals("*")) {
                Result = Operator1 * Operator2;
            }
            if (op2.equals("/")) {
                Result = Operator1 / Operator2;
            }

            return Result;
        }
}
