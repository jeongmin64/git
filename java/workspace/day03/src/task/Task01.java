package task;

import java.lang.management.OperatingSystemMXBean;

public class Task01 {
   public static void main(String[] args) {
       //1. 기본 자료형의 변수를 선언하고 초기화한 뒤 값을 출력하기
      
//      출력결과 예시
//      int: 100000
//      long: 123456789L
//      float: 3.14f
//      double: 3.14159265359
//      char: A
//      boolean: true
	   int num1 = 10000;
	   long num2 = 123456789L;
	   float num3 = 3.14f;
	   double num4 = 3.14159265359;
	   char alpha = 'A';
	   boolean Istrue = true;
	   System.out.println(num1);
	   System.out.println(num2);
	   System.out.println(num3);
	   System.out.println(num4);
	   System.out.println(alpha);
	   System.out.println(Istrue);
	   
      
      //2. 이름과 생년월일을 저장할 상수를 선언하고 출력하기
      
//      출력결과
//      제 이름은 000이고 생년월일은 000000입니다
	    String myname = "이정민";
	    int birth = 2000611;
	    System.out.println("제 이름은" + myname +"이고" +"생년월일은" +birth +"입니다");
      
      //3. 아래 변수를 선언하고 변수의 데이터 타입과 값을 출력하기
      
      // 정수형 age 변수 선언, 값 : 25
      // 실수형 height 변수 선언, 값 : 160.5
      // 논리형 isStudent 변수 선언, 값 : true
	    int age = 25;
	    double height = 160.5;
	    boolean isStudent = true;
	    System.out.println(age + " int형 타입");
	    System.out.println(height + " double형 타입");
	    System.out.println(isStudent + " boolean형 타입");
      
//      출력결과
//      나이 : 25, 타입은 000형
//      키 : 160.5, 타입은 000형
//      학생여부 : true, 타입은 000형
      
      //4. hobby라는 문자열 변수 선언 후 값을 초기화하여 출력하기(printf 한번만 사용)
      // 
//      출력결과
//      안녕하세요, 제 이름은 [000]입니다.
//      제 취미는 [00]입니다.
	    
	    String hobby = "game";
	    String name = "이정민";
	    System.out.printf("안녕하세요, 제 이름은 %s입니다.제 취미는 \n%s입니다.", name, hobby);
      
      //5. 아래 변수를 선언하고 각 자료형 변환을 수행하여 결과 출력하기
      String strNum = "100";
      int intNum = 200;
      double doubleNum = 300.5;
      char charLetter = 'C';
      boolean boolVal = true;
      
//      strNum을 정수로 변환하여 덧셈 연산 : intNum + strNum
//      intNum을 실수로 자동 형변환하여 덧셈 연산 : intNum + doubleNum
//      charLetter를 정수로 변환하여 출력
//      boolVal을 문자열로 변환하여 출력
      
   }
   
}
