package com.company;

public class TypeCulc {

    static String[] arabSyms = new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    static String[] romeSyms = new String[] {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

    public static String GetTypeNumber(String num) {
        String TypeNumber1 = "";
        int length = romeSyms.length;
        for(int i = 0; i < length; i++){
            if (num.equals(arabSyms[i])){
                TypeNumber1 = "arab";
                break;
            }
            if (num.equals(romeSyms[i])){
                TypeNumber1 = "rome";
                break;
            }
        }
        return TypeNumber1;
    }

    public static int GetOperator(String op){
        int res = 0;
        int length = arabSyms.length;
        for(int i = 0; i < length; i++){
            if (op.equals(arabSyms[i])){
                res = i + 1;
                break;
            }
            if (op.equals(romeSyms[i])){
                res = i + 1;
                break;
            }
        }
        return res;
    }
}
