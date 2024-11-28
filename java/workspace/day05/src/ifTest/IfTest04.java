package ifTest;

import java.util.Scanner;

public class IfTest04 {
   public static void main(String[] args) {
      //삼항연산자로 작성했던 두 수를 입력받아 큰 수 출력하기
      // => if ~ else if ~ else문으로 변경
      
      //1) 입력 클래스 import
      //2) 변수 선언 int 2개
      //3) 입력 메시지 출력 + 입력 메소드 대입
      //4) 조건문(if ~ else if ~ else문)
      //4-1)   if (변수1 > 변수2) {
      //4-2)       변수1이 변수2보다 큽니다 출력
      //4-3)   }else if(변수1 == 변수2){
      //4-4)       변수1과 변수2가 같습니다 출력
      //4-5)   }else{
      //4-6)      변수2가 변수1보다 큽니다 출력
      //      }
      
	   Scanner sc = new Scanner(System.in);
	   int num1 =0, num2=0;
	   System.out.println("두 정수의 값:");
	   num1 =sc.nextInt();
	   num2 =sc.nextInt();
	   
	   if(num1>num2) {
		  System.out.println("num1이 num2보다 크다.");
	   }else if(num1==num2) {
		   System.out.println("num1과 2가 같다.");
	   }else {
		   System.out.println("num2가 num1보다 크다.");
	   }
	   
   }
}
