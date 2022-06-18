package Method;

public class Method {
//	 public static void numbering(int init, int limit) { // init, limit => 매개변수(parameter)
//		    int i = init;
//		    while (i < limit) {
//		      System.out.println(i);
//		      i++;
//		    }
//		  }
//
//		  public static void main(String[] args) {
//		    numbering(1, 5);    // 1, 5 => 인자(argument)
//		  }
		  //====================================================================
		  
		  public static String numbering1(int init, int limit) {   // (1) 'numbering'이 'return'할 값이 반드시 'String'이다
		      int i = init;
		      String output = "";//
		      while (i < limit) {
		          output += i;//
		          i++;
		      }
		      return output; //
		  }

		  public static void main(String[] args) {
		      String result = numbering1(1, 5);    // numbering이 리턴한 값이 변수 result에 담긴다 
		      System.out.println(result);         // (1)에 의해서 result는 String만 가능하다
		  }
		  
}



	