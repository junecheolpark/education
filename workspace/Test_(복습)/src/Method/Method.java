package Method;

public class Method {
//	 public static void numbering(int init, int limit) { // init, limit => �Ű�����(parameter)
//		    int i = init;
//		    while (i < limit) {
//		      System.out.println(i);
//		      i++;
//		    }
//		  }
//
//		  public static void main(String[] args) {
//		    numbering(1, 5);    // 1, 5 => ����(argument)
//		  }
		  //====================================================================
		  
		  public static String numbering1(int init, int limit) {   // (1) 'numbering'�� 'return'�� ���� �ݵ�� 'String'�̴�
		      int i = init;
		      String output = "";//
		      while (i < limit) {
		          output += i;//
		          i++;
		      }
		      return output; //
		  }

		  public static void main(String[] args) {
		      String result = numbering1(1, 5);    // numbering�� ������ ���� ���� result�� ���� 
		      System.out.println(result);         // (1)�� ���ؼ� result�� String�� �����ϴ�
		  }
		  
}



	