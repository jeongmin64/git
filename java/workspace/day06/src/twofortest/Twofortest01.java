package twofortest;

public class Twofortest01 {
	public static void main(String[] args) {
		
		for(int i =1; i<3; i++) {
			for(int j=1; j<3; j++) {
				System.out.println("i:"+i+" ,j:"+j);
			}
		}
		
		
		// 1. 바깥 for문 시작
		// 처음 i=1로 초기화, i<3조건검사해서 true 반복문 내부로 들어간다
		// 2. 안쪽 for문 시작
		// j=1로 초기화, j<3조건을 검사해서 true 반복문 내부로 들어간다
		// System.out.println("i:"+i+" ,j:"+j); i=1,j=1
		// 3. 안쪽 for문 진행
		// j가 1증가 -> j=2가된다
		// j<3조건을 검사해서 true이므로 내부 코드를 실행한다
		// System.out.println("i:"+i+" ,j:"+j); i=1,j=2
		// 다시 j++를 실행, j=3
		// j<3조건이 false이므로 안쪽 반복문 종료
		// 4. 바깥쪽 for문 실행
		// i가 1증가 -> i=2가된다
		// i<3조건을 다시 검사하여 조건이 true이므로 내부 코드를 실행한다
		// 5. 안쪽 for문 진행
		// j=1로 초기화, 동일한 방식으로 반복
		// 6. 바깥쪽 for문 종료
		// i가 1증가 -> i=3이된다
		// i<3조건을 검사하여 조건이 false이므로 바깥 반복문이 종료된디
		
		// 결론: 바깥 for문이 1번 반복할 때 안쪽 for문은 처음부터 끝까지(조건이 false) 실행된다
		// 바깥 for문의 조건이 false가 될 때까지 반복된다
		
	}
	
}
