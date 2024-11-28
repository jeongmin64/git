package twofortest;

import java.util.Scanner;

public class Exam2 {
   public static void main(String[] args) {
      // 문제
      // 1. 점심메뉴를 보여준다.
      // 1-1. 메뉴 4개이다.
      // 1-2. 짜장(5000원) 돈까스(8000원) 피자(25000원) 햄버거(6000원)
      // 1-3. 4개의 메뉴중에 하나 입력시 가격과 메뉴 메시지 출력
      // 단, 문자열 비교시 ==이 아닌 equals를 활용할것
      //+ 문제 while문을 활용한 동일한 값이 아닐 때 재입력을 통해 올바른 값이 나오게끔 진행
      // 
      
      // 설명코드
      // 먼저 Scanner 클래스를 import한다
      // 각 정수형 변수에 가격을 대입과 동시에 초기화한다.
      // 문자열을 입력 받으려면 String 타입을 선언하고 초기화한다.
      // 점심메뉴를 출력 메소드를 활용해서 보여준다.
      // 입력 메소드를 활용
      // if문을 활용하고 조건식에는 equals를 사용
      // 해당 문자열이 같을 시 가격을 보여주고 아닐 시,재입력을 통해 진행한다
      //
      // + while 문 조건식을 넣었을 때 (위 문자열 타입과 비교하고 논리연산 OR을 활용하고 거짓일 때 반복하기 위해 ! 부정을 사용)
      //  출력 메소드 생성을 통해 재입력이란 것을 알려줘야한다
      //   입력 메소드를 통해 재입력을 받는다
      
      Scanner sc = new Scanner(System.in);
      int food1 = 5000;
      int food2 = 8000;
      int food3 = 25000;
      int food4 = 6000;
      String menu = "";

      System.out.println("점심 메뉴 : 짜장, 돈까스, 피자, 햄버거");
      menu = sc.next();

      while (!("짜장".equals(menu) || "돈까스".equals(menu) || "피자".equals(menu) || "햄버거".equals(menu))) { // 거짓일시 재입력을 실행시키위한 논리연산 진행
         System.out.println("재입력 : ");
         menu = sc.next();
      }
      if ("짜장".equals(menu)) {
         System.out.println(menu + ":" + food1);
      } else if ("돈까스".equals(menu)) {
         System.out.println(menu + ":" + food2);
      } else if ("피자".equals(menu)) {
         System.out.println(menu + ":" + food3);
      } else if ("햄버거".equals(menu)) {
         System.out.println(menu + ":" + food4);
      }
         System.out.println("메뉴가 정상적으로 선택되었습니다");
   }
   

}
