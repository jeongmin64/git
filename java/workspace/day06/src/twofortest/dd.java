package twofortest;

import java.util.Scanner;

public class dd {
	public static void main(String[] args) {
		
//		업다운문제
//		   초기 숫자 상수로 정하고 숫자 3회 입력
//		     > (상수 > 입력) : up 출력
//		     > (상수 < 입력) : down 출력
		
		Scanner sc = new Scanner(System.in);
		final int NUM = 25;
		  int num1 = 0;
	         for(int i = 1; i < 4 ; i++) {
	            System.out.print("숫자 입력 : " );
	            num1 = sc.nextInt();
	            if(num1 == NUM) {
	            	System.out.println("정답입니다.");
	               break;
	            }else if(num1 > NUM) {
	               System.out.println("down");
	            }else {
	               System.out.println("up");
	            }
	         }

	
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
