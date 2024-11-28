package print;

import java.lang.management.OperatingSystemMXBean;

public class PrintTask {
	public static void main(String[] args) {
		
		//1. prinf를 사용해 형식에 맞게 출력하기
		//이름 : 본인이름 -문자열	
		//나이 : 본인나이	 -정수형
		//취미 : 취미		-문자열
		//키 : 실수형 2자리까지	-실수형
		//몸무게 : 실수형 3자리까지	-실수형
		
		String name ="이정민";
		int age = 25;
		String hobby ="롤";
		double height = 173.55;
		double weight = 72.125;
		System.out.printf("이름:%s \n나이:%d \n취미:%s \n키:%f\n몸무게:%f", name, age, hobby, height, weight);
		
		//2. 10진수의 값 255를 8진수, 16진수, 10진수로 각각 출력하기
		int num = 255;
		System.out.printf("\n10진수 : %d", 255); 
		System.out.printf("\n8진수 : %o", 255); 
		System.out.printf("\n16진수 : %x", 255); 
		System.out.printf("\n10진수 : %o", 255); 
		
		
		
		//3. 상품정보를 println과 printf를 사용하여 아래 형식으로 출력하기
		// 각 자리수는 5자리로 정렬, tab키 2번사용
//		--------------------------------
//		상품명 가격
//      --------------------------------
//		메로나 1500원
//		누네띠네 1200원
//		꼬붑칩 2000원
//		초코파이 3000원
		
		System.out.println("\n-------------------------");
	      System.out.printf("%-5s\t\t%5s\n", "상품명", "가격");
	      System.out.println("-------------------------");
	      System.out.printf("%-5s\t\t%5d원\n", "메로나", 1500);
	      System.out.printf("%-5s\t\t%5d원\n", "누네띠네", 1200);
	      System.out.printf("%-5s\t\t%5d원\n", "꼬북칩", 2000);
	      System.out.printf("%-5s\t\t%5d원\n", "초코파이", 3000);
	      
	     //4. 봄여름가을겨울을 아래와 같이 출력하기
	      
	     // 봄
	     //			여름
	     //		가을
	     //			겨울
	      System.out.println("봄\n\t\t여름\n\t가을\n\t\t겨울");
	      

		
	}
}
