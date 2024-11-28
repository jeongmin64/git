package twofortest;

import java.util.Scanner;

public class Twofortest03 {
	public static void main(String[] args) {
		
		
		//입력클래스 import
		//입력메시지 출력
		//입력한값변수대입
		//해당변수를 바깥for문 조건식에 넣기
		
		Scanner sc = new Scanner(System.in);
		System.out.println("출력할 행의 수를 입력하세요.");
		int choice =0;
		choice= sc.nextInt();
		sc.nextLine();
	      for (int i = 1; i <= choice; i++) {
//	         System.out.println("*"); //행
	         for (int j = 1; j <= i; j++) { // 열
	            System.out.print("*");
	         }
	         System.out.println();
	      }
	      
	      sc.close();
	      
	}
}
