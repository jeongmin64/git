package scanner;

import java.util.Scanner;

//5번: 입력 메소드 실습
public class ScannerTask01 {
	public static void main(String[] args) {

		// 두 정수를 입력받고 합을 출력하기
		// next 메소드를 사용한다
		// [입출력 결과]
		// 정수1 입력: 10
		// 정수2 입력: 20
		// 두 정수의 합은 30입니다.

		// 1. 변수 2개 선언한다(String)
		// 2. 입력 클래스 import
		// 3. 출력 메시지 (정수1입력 : )
		// 4. 입력 메소드(.next) 변수1에 대입
		// 5. 출력메시지(정수2 입력 : )
		// 6. 입력 메소드(.next) 변수2에 대입
		// 7. 출력(형변환)
		int num1 = 0, num2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수1입력:");
		num1 = sc.nextInt();
		System.out.println("정수2입력:");
		num2 = sc.nextInt();
//		System.out.println("두 정수의 합은" + Integer.parseInt(num1 + num2)"입니다");
	}

}
