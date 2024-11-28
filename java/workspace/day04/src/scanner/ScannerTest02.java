package scanner;
// 2번: 입력메소드(로직구성)
import java.util.Scanner;

public class ScannerTest02 {
	public static void main(String[] args) {
		
		//1. 입력클래스 변수 만들기
//		Scanner sc = new Scanner(System.in);
		//2. 출력메시지(입력받을것이 어떤건지)
//		System.out.println("지금 배우고 있는 프로그래밍 언어는?");
		//3. String 변수 = 입력메소드
//		String subject = sc.next();
		//4. 변수 출력
//		System.out.println(subject);
		
		//실습 
		//이름을 입력하세요 : 000
		// 000님 안녕하세요
		// printf 사용하기
		
		
		//1.입력클래스 변수 만들기 ctrl+shift+o
		Scanner sc = new Scanner(System.in);
		//2.출력메시지(입력받을것이 어떤건지)
		System.out.print("이름을 입력하세요 :");
		//3. String 변수 = 입력메소드(.next())
		String name = sc.next();
		//4. 변수 출력
		System.out.printf("%s님 안녕하세요",name);
		
		
		
		
	}
}
