package twofortest;

import java.util.Scanner;

public class dd2 {
	public static void main(String[] args) {
		
		//1. 로직구성
		//scanner 입력메소드 
		//final로값(상수) 지정 
		//사용자한테 입력받는 변수 num1 지정
		//for문을 사용해서 3회 반복문 작성
		//출력 메시지를 통해 사용자에게 입력받기
		//사용자에게 입력받기
		//입력값과 지정한 값이 같다면 break문을 사용해 반복문 종료
		//입력값이 지정한 값보다 크면 다운이라는 메시지 출력
		//입력값이 지정한 값보다 크거나 같은 경우를 제외했기 때문에 작은 경우밖에 없어서 업이라는 메시지 출력
		
	   
	      Scanner sc = new Scanner(System.in);
	 
	      String answer1 = "";
	      String answer2 = "";
	    
	      System.out.println("1번문제) 아기화장품은 순해서 어른들이 사용해도 괜찮다? 정답 :");
	      
	      answer1 = sc.next();
	      
	      if(answer1.equals("O")) {
	      
	         System.out.println("2번문제로 넘어갑니다");
	         System.out.println("2번문제) 독사가 자기 혀를 깨물면 죽는다? 정답 : ");
	     
	         answer2 = sc.next();
	         if(answer2.equals("O")) {
	            System.out.println("모든 문제를 맞췄습니다. O/X 퀴즈가 종료됩니다.");
	         }else {
	            System.out.println("2번문제를 틀렸습니다.");
	         }
	         }else {
	            System.out.println("1번문제를 틀렸습니다.");
	            
	         }
	}
}

































