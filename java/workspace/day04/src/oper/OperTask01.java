package oper;

import java.util.Scanner;

public class OperTask01 {
	public static void main(String[] args) {
		//1. 사용자로부터 두개의 숫자를 입력받아 두 숫자의 합과 곱을 각각 출력하기
		
		//입력클래스 import
		//변수 2개 선언(int)
		//출력메시지
		//입력메소드 nextInt()
		//출력(합 , 곱 )
		//nextLine() : 버퍼 지우기
		Scanner sc = new Scanner(System.in);
		
		int num1 = 0, num2 = 0;
		System.out.println("두개의 정수를 입력하세요:");
		num1 = sc.nextInt();
        num2 = sc.nextInt();
		System.out.println(num1 + "+" + num2 +"=" + ( num1 + num2 ));
		System.out.println(num1 +  "*" + num2 + "="+ (num1*num2));
		sc.nextLine();
		
		
		
		//2. 1번에서 입력받은 두개의 숫자를 사용하여 평균을 계산하고 소수점 두자리수까지 출력하기
		//num1+num2 변수 선언(int)
		//double 변수 변수 1/2
		//출력
		
		int sum = num1+num2;
		double avg = sum/2.0;
		System.out.printf("평균은 %.2f", avg);
		
	
		
		
		
		//3. 두 자리수 정수를 입력받고 십의자리와 일의자리를 출력하기
		//입출력 결과
		//두 자리수 정수를 입력하세요:
		//십의자리는 _입니다. 일의자리는 _입니다
		
		//변수 선언 int타입 3개
		// 입력메소드 (nextInt)
		// 십의자리변수/ 10
		// 일의자리 % 10
		// 출력
		// nextLine()
		
		int number = 0, result1 = 0, result2=0;
		number=sc.nextInt();
		result1=number/10;
		result2=number%10;
		System.out.println("십의자리는"+result1+"입니다.일의자리는"+result2+"입니다.");
		
		
		
		
		//4. 코인노래방 프로그램 만들기, 사용자에게 금액을 입력받고 부를수있는 곡수와 잔돈 출력하기
		// 한곡의 가격은 400원 입니다
		
		//메시지 출력(금액을 입력하세요:)
		//변수(int) 입력메소드
		//변수(int)곡을 계산할수있는 식
		//변수(int)잔돈을 계산할수있는식
		//출력
		
		
		System.out.println("금액을 입력하세요:");
		int money = sc.nextInt();
		int song = money/400;
		int change = money%400;
		System.out.printf("노래할수있는곡은 %d곡이고,잔돈이 %d원 반환되었습니다",song,change);
		
		
		
		
		
		
		
		
		
		
		
	
		
		
	}
}
