package Array배열;

public class Array {
	public static void main(String[] args) {

//		1.6과목의 점수(정수)를 저장할 수 있는 변수 score를 선언 및 생성하시오.
		
		int[] score = new int[6]; 
	
//		2. 위 score 각 방을 0~100 사이의 임의의 정수 값으로 변경하시오
		
		for(int i = 0; i<score.length; i++ ) {
			score[i] = (int)(Math.random()*101);
		}
		
//		3. score의 각 방의 값을 출력하여라.

	    for(int i = 0; i < score.length; i++){
	   		 System.out.print(". " + score[i]);
	    }
	    
//	    4. 방의 합계를 구하시오
	    int sum = 0;
	    for(int i = 0; i < score.length; i++) {
	    	sum += score[i];
	    	System.out.println(" " + sum);
	    }
//	    5. score 값들의 평균. 단 소수점 3번째 자리에서 두 번째 자리까지 반올림해서 표현하시오 **몰랏음 long형과 float형은 L,f를 붙여야됨
	    float avg = 0f;
	    avg = (float)sum/score.length;
	    System.out.println((int)(avg*100 + 0.5)/100f);
	    
//	    6. score의 값들 중 최댓값과 최솟값을 구하시오.
	    //
//	    (단, 최댓값을 0으로 초기화하지 말고 최솟값을 100으로 초기화하지 말 것)
	    
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
