package twofortest;

import java.util.Scanner;

public class Twofortask01 {
	public static void main(String[] args) {
//		i,j의 규칙성찾기
//		1번 : 역삼각형
//		*****
//		****
//		***
//		**
//		*
//		
//		2번 : 피라미드와 유사하지만 좌측정렬
//		*
//		***
//		*****
//		*******
//		
//		3번 : 피라미드(for문이 총 3개 => 어떻게 사용될지 먼저 생각하기)
//		  *
//       * *
//      * * *
		
//		Scanner sc = new Scanner(System.in);
//		int choice=0;
//		System.out.println("입력");
//		choice=sc.nextInt();
//		for(int i =1; i<=choice; i++) {
//			for(int j=1; j<=6-i; j++) {
//				System.out.print("*");
//			} 
//			System.out.println();
//		}
		
		Scanner sc = new Scanner(System.in);
		int choice=0;
		System.out.println("입력");
		choice=sc.nextInt();
		for(int i =1; i<=choice; i++) {
			for(int j=1; j<=i*2-1; j++) {
				System.out.print("*");
			} 
			System.out.println();
		}
		
		
		
	
//		for(int i =1; i<=5; i++) {
//			for(int j=1; j<=6-i; j++) {
//				System.out.print("*");
//			} 
//			System.out.println();
//		}
//		

		
		
		
		
		
		
		
		
		
		
		
	}
}
