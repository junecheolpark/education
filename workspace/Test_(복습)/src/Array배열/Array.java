package Array�迭;

public class Array {
	public static void main(String[] args) {

//		1.6������ ����(����)�� ������ �� �ִ� ���� score�� ���� �� �����Ͻÿ�.
		
		int[] score = new int[6]; 
	
//		2. �� score �� ���� 0~100 ������ ������ ���� ������ �����Ͻÿ�
		
		for(int i = 0; i<score.length; i++ ) {
			score[i] = (int)(Math.random()*101);
		}
		
//		3. score�� �� ���� ���� ����Ͽ���.

	    for(int i = 0; i < score.length; i++){
	   		 System.out.print(". " + score[i]);
	    }
	    
//	    4. ���� �հ踦 ���Ͻÿ�
	    int sum = 0;
	    for(int i = 0; i < score.length; i++) {
	    	sum += score[i];
	    	System.out.println(" " + sum);
	    }
//	    5. score ������ ���. �� �Ҽ��� 3��° �ڸ����� �� ��° �ڸ����� �ݿø��ؼ� ǥ���Ͻÿ� **������ long���� float���� L,f�� �ٿ��ߵ�
	    float avg = 0f;
	    avg = (float)sum/score.length;
	    System.out.println((int)(avg*100 + 0.5)/100f);
	    
//	    6. score�� ���� �� �ִ񰪰� �ּڰ��� ���Ͻÿ�.
	    //
//	    (��, �ִ��� 0���� �ʱ�ȭ���� ���� �ּڰ��� 100���� �ʱ�ȭ���� �� ��)
	    
	    int min = score[0];
	    int max = score[0];
	    for(int i = 0; i<score.length;i++) {
	    	if(score[i]>max) {
	    		max = score[i];
	    	}
	    	if(score[i]<min) {
	    		min = score[i];
	    	}
	    	
	    }
	    System.out.print("\n" + max);
    	System.out.print("\t" + min);

	     
	    
	    
	}
}
