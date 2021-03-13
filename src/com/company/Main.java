package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

		Scanner String = new Scanner(System.in);
		String start;
		start = String.nextLine();
		String[] syms = start.split(" ");

		try{
			if(syms.length !=3){
				throw new Exception("Неверный формат ввода. Допустимый формат ввода: [Операнд][Пробел][Оператор][Пробел][Операнд]. Примеры ввода: (V + VI), (4 * 8).");
			}
			if(!TypeCulc.GetTypeNumber(syms[0]).equals(TypeCulc.GetTypeNumber(syms[2]))){
				throw new Exception("Калькулятор умеет работать только с арабскими или римскими цифрами от 1 до 10(от I до X) одновременно. Примеры ввода: (V + VI), (4 * 8).");
			}
			if(TypeCulc.GetTypeNumber(syms[0]).equals("") && TypeCulc.GetTypeNumber(syms[2]).equals("")){
				throw new Exception("Калькулятор умеет работать только с арабскими или римскими цифрами от 1 до 10(от I до X) одновременно. Примеры ввода: (V + VI), (4 * 8).");
			}
			if(!syms[1].equals("+") && !syms[1].equals("-") && !syms[1].equals("*") && !syms[1].equals("/")){
				throw new Exception("Введена недопустимая арифметическая операция. Допускаются следующие операции: +, -, *, /. Примеры ввода: (V + VI), (4 * 8).");
			}
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
			System.out.println("Программа завершена");
			System.exit(0);
		}

		Culc Result = new Culc();

		if(TypeCulc.GetTypeNumber(syms[0]).equals("arab") && TypeCulc.GetTypeNumber(syms[2]).equals("arab")){
			System.out.println(Result.res(syms));
		}
		if(TypeCulc.GetTypeNumber(syms[0]).equals("rome") && TypeCulc.GetTypeNumber(syms[2]).equals("rome") && (Result.res(syms) <= 0)){
			System.out.println("Ответа нет. В римском алфавите нет отрицательных чисел и нуля.");
		}
		else if(TypeCulc.GetTypeNumber(syms[0]).equals("rome") && TypeCulc.GetTypeNumber(syms[2]).equals("rome")){
			System.out.println(Rome.ArabToRome(Result.res(syms)));
		}
    }
}
