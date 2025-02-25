package variable;
//4번 : 변수
public class Variable3 {
	public static void main(String[] args) {
		//정수형 int 4byte : -2,147,483,648 ~ 2,147,483,647(32비트 정수)
		//정수형 long 8byte : -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 (64비트 정수)
		
		int intVal = 2147483647;
		System.out.println(intVal);
		long longVal = 2147483648L;
		System.out.println(longVal);
		
		//실수형 double 8byte : 15자리 소수점 이하 => 더 높은 정밀도와 넓은 범위의 실수를 표현
		//실수형 float 4byte : 6~7자리 소수점 이하 => 메모리를 더 작게 사용하지만 정밀도가 낮기 때문에 계산 오차가 사용할 수 있음
		
		double doubleVal = 3.1415926535897973;
		System.out.println(doubleVal);
		float floatVal = 3.1415926f;
		System.out.println(floatVal);
		
		//계산 오차 확인
		double doubleSum = 0.1 + 0.2;
		float floatSum= 0.1f + 0.2f;
		System.out.println(doubleSum);
		System.out.println(floatSum);
		
		//논리형 boolean : true, false
		boolean isJava = true;
		System.out.println("java공부중인가요?" + isJava);
		
		//문자형 char : ''작은 따음표로 표현
		char grade = 'A';
		System.out.println("java 학점: " + grade);
		
		//문자열 String = "" 큰 따음표로 표현
		String myName = "이정민";
		System.out.println("제 이름은 " + myName + "입니다");
		
				
	}

}
