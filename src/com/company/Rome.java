package com.company;

public class Rome {

    static String ArabToRome(int num){

        int M = num / 1000;
        int D = (num % 1000) / 500;
        int C = ((num % 1000) % 500) / 100;
        int L = (((num % 1000) % 500) % 100) / 50;
        int X = ((((num % 1000) % 500) % 100) % 50) / 10;
        String I;
        String res;

        if (((((num % 1000) % 500) % 100) % 50) % 10 > 0){
           I = TypeCulc.romeSyms[((((num % 1000) % 500) % 100) % 50) % 10 - 1];
        }
        else {
            I = "";
        }

        res = stringMultiply("M", M) +
                stringMultiply("D", D) +
                stringMultiply("C", C) +
                stringMultiply("L", L) +
                stringMultiply("X", X) +
                I;

        return res;
    }
    public static String stringMultiply(String s, int n){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            sb.append(s);
        }
        return sb.toString();
    }
}
