package oper;
//11번:관계연산자와 논리연산자
import java.util.Scanner;


public class OperTest03 {
	public static void main(String[] args) {
//		int num1 =10;
//		int num2 =15;
//		System.out.println("num1 > num2: num1이 num2보다 크니?"+(num1>num2));
//		System.out.println("num1 < num2: num1이 num2보다 작니?"+(num1<num2));
//		System.out.println("num1 >= num2: num1이 num2보다 크거나같니?"+(num1>=num2));
//		System.out.println("num1 <= num2: num1이 num2보다 작거나같니?"+(num1<=num2));
//		System.out.println("num1 == num2: num1이 num2이랑 같니?"+(num1==num2));
//		System.out.println("num1 != num2: num1이 num2이랑 같지않니?"+(num1!=num2));
		
//		Scanner sc = new Scanner(System.in);
//		int num3 = 0, num4 =0;
//		System.out.println("두 수를 입력하세요");
//		num3=sc.nextInt();
//		num4=sc.nextInt();
//		System.out.println("num3이 num4보다 크니?"+(num3>num4));
//		System.out.println("num3이 num4보다 작니?"+(num3<num4));
//		System.out.println("num3이 num4보다 크거나같니?"+(num3>=num4));
//		System.out.println("num3이 num4보다 작거나같니?"+(num3<=num4));
//		System.out.println("num3이 num4보다 같니?"+(num3==num4));
//		System.out.println("num3이 num4보다 같지않니?"+(num3!=num4));
		
		System.out.println("------------------논리연산자-------------------");
		System.out.println(true && true); //and연산자 둘중 하나라도 거짓이면 거짓(&&)
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		
		System.out.println(true || true); //or연산자 둘중 하나라도 참이면 참(||)
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println(!true); //not연산자 반대로 나옴(!)
		System.out.println(!false);
	}
}
