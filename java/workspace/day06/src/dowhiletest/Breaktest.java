package dowhiletest;
//6번 : 기타 제어문-break문
public class Breaktest {
   public static void main(String[] args) {
      //1~10까지 중 5까지만 출력하기
      for(int i = 0; i < 10; i++) {
         if(i == 4) {
            break;
         }
         System.out.println(i + 1);   
      }      
      //1~10까지 중 7까지만 출력(while문)
      
      int num =1;
      while(num<=10) {
    	  if(num>7) {
    		  break;
    	  }
    	  System.out.println(num);
    	  num++;
      }
      
      
   }
}
