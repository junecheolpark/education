import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		실습 1. 아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 “OO메뉴입니다“를,
//		종료 번호를 누르면 “프로그램이 종료됩니다.”를 출력하세요
		/*
		 
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("메뉴 번호를 입력하세요 : ");
		
		int num = Integer.parseInt(sc.nextLine());
		
		String menu = "메뉴";
		
		switch (num) {
		case 1 : menu = "입력"; break;
		case 2 : menu = "수정"; break;
		case 3 : menu = "조회"; break;
		case 4 : menu = "삭제"; break;
		case 7 : menu = "종료"; break;
		default: System.out.println("잘못된 입력입니다.");
		}
		
		System.out.println(menu + " 메뉴 입니다.");
		
		*/
		
		
//		실습2.키보드로 입력 받은 정수가 양수이면서 짝수일 때만 “짝수다”를 출력하고
//		짝수가 아니면 “홀수다“를 출력하세요.
//		양수가 아니면 “양수만 입력해주세요.”를 출력하세요
		
		/*
		System.out.println("숫자를 한 개 입력하세요 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		if (num % 2 == 0 && num >= 0) {
			System.out.println("짝수다.");
		}else if (num % 2 != 0 && num >= 0) {
			System.out.println("홀수다.");
		}else {
			System.out.println("양수만 입력해주세요.!");
		}
		*/
		
//		실습3.국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
//		합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
//		(합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
//		합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
//		불합격인 경우에는 “불합격입니다.”를 출력하세요.
		/*
		System.out.print("국어점수 : ");
		int k = Integer.parseInt(sc.nextLine());

		System.out.print("수학점수 : ");
		int m = Integer.parseInt(sc.nextLine());

		System.out.print("영어점수 : ");
		int e = Integer.parseInt(sc.nextLine());

		int sum = k + m + e;
		double di = sum / 3.0;
		if (k >= 40 && m >= 40 && e >= 40 && di >= 60) {
			System.out.println("국어 : " + k);
			System.out.println("수학 : " + m);
			System.out.println("영어 : " + e);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + di);
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격 입니다.");
		}
		*/
		
//실습 4.수업 자료(7page)에서 if문으로 되어있는 봄, 여름, 가을, 겨울 예제를 switch문으로 바꿔서 출력하세요.
		
		/*
		System.out.println("1~12 사이의 정수 입력 : ");
		int num = Integer.parseInt(sc.nextLine());

		switch (num) {
		case 12:
		case 1:
		case 2:
			System.out.println(num + "월은 겨울입니다.");
			break;

		case 3:
		case 4:
		case 5:
			System.out.println(num + "월은 봄입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(num + "월은 여름입니다.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println(num + "월은 가을 입니다.");
			break;

		default:
			System.out.println(num + "월은 잘못된 입력입니다.");
		}
		*/
		
//		//실습5.아이디, 비밀번호를 정해두고 로그인 기능을 작성하세요.
//		로그인 성공 시 “로그인 성공”, 
//		아이디가 틀렸을 시 “아이디가 틀렸습니다.“,
//		비밀번호가 틀렸을 시 “비밀번호가 틀렸습니다.”를 출력하세요
		
		/*
		System.out.print("아이디 : ");
		String id = sc.nextLine();

		System.out.print("비밀번호 : ");
		String pw = sc.nextLine();

		if (id.equals("myId") && pw.equals("myPassword12")) {
			System.out.println("로그인 성공");
		} else if (id.equals("myId")) {
			System.out.println("비밀번호가 틀렸습니다.");
		} else if (pw.equals("myPassword12")) {
			System.out.println("아이디가 틀렸습니다.");
		} else {
			System.out.println("잘못입력하셨습니다.");
		}
		*/
		
//		사용자에게 관리자, 회원, 비회원 중 하나를 입력 받아 각 등급이 행할 수 있는 권한을 출력하세요.
//		단, 관리자는 회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
//		회원은 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
//		비회원은 게시글 조회만 가능합니다.
	/*
		System.out.print("권한을 확인하고자 하는 회원 등급(관리자, 회원, 비회원) : ");
		String a = sc.nextLine();

		switch (a) {
		case "관리자":
			System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
			break;
		case "회원":
			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
			break;
		case "비회원":
			System.out.println("게시글 조회");
			break;
		default:
			System.out.println("없는 등급입니다.");
		}
		*/
		
//		키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라
//		저체중/정상체중/과체중/비만을 출력하세요.
//		BMI = 몸무게 / (키(m) * 키(m))
//		BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
//		BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
//		BMI가 30이상일 경우 고도 비만
		
	System.out.print("키(m)를 입력해 주세요 : ");
	double m = sc.nextDouble();

	System.out.print("몸무계(kg)을 입력해 주세요 : ");
	double kg = sc.nextDouble();

	double mbi = kg / (m * m);
	System.out.println("MBI 지수 : " + mbi);

	if (mbi >= 0 && mbi < 18.5) {
		System.out.println("저체중");
	} else if (mbi >= 18.5 && mbi < 23) {
		System.out.println("정상체중");
	} else if (mbi >= 23 && mbi < 25) {
		System.out.println("과체중");
	} else if (mbi >= 25 && mbi < 30) {
		System.out.println("비만");
	} else if (mbi > 30) {
		System.out.println("고도 비만");
	}
		
		
		
		
		
	}
}
