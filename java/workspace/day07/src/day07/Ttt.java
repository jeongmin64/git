package TwoForTest;

import java.util.Scanner;

public class TwoForTest02 {
   public static void main(String[] args) {
      //먼저 Scanner 클래스를 import한다
      //A라는 문자를 입력 받으면 종료를 하고 싶어 출력 메시지로 A의 아스키코드인 65를 미리 알려준다
      //출력 메시지를 통해 알고싶은 문자를 입력 해달라고 한다
      //scanner를 통해 사용자로부터 원하는 문자를 입력받는다
      //입력받는 문자를 아스키코드로 변환
      //변환받은 값을 출력해 주고 
      //반복문을 사용해 사용자에게 다시 문자를 입력 받을 수 있게 출력메시지와 scanner를 통해 입력을 받음 물론 A를 입력 받으면 실행 종료
      //사용자가 A라는 문자를 입력하지 않으면 반복문을 통해 계속 자신이 알고싶어하는 문자의 아스키코드를 알 수 있음.
      
      Scanner sc = new Scanner(System.in);
      System.out.println("A의 아스키코드는 65입니다");
      System.out.print("아스키 코드를 알고 싶은 문자 입력(A입력시 종료) : ");
      char ch = sc.nextLine().charAt(0);
      int num1 = (int) ch ;
      
      while(ch != 'A') {
         System.out.println("입력하신 문자" + ch + "의 아스키 코드는 : " + num1);
         System.out.print("아스키 코드를 알고 싶은 문자 입력(A입력시 종료) : ");
         
         ch = sc.nextLine().charAt(0);
         num1 = (int) ch ;
         
      }
      
   }
}

	
