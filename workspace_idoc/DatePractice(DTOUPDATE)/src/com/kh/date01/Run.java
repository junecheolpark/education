package com.kh.date01;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {
	public static void main(String[] args) throws Exception {
		// 새로운 멤버 등로
		// 등록된 멤버의 정보 조회
		// id, pw, birth_date 모두 다 입력 받을 것.
		Scanner sc = new Scanner(System.in);
		MemberDAO dao = new MemberDAO();
		/*
		System.out.print("id 입력 >> ");
		String id = sc.nextLine();
		System.out.print("pw 입력 >> ");
		String pw = sc.nextLine();
		System.out.print("생일 입력(예)19900101) >> ");
		String birth_date = sc.nextLine();
		
		MemberDTO dto = new MemberDTO(id, pw, birth_date);
		int rs = dao.insert(dto);
		if(rs > 0) {
			System.out.println("데이터 삽입 성공");
		}else {
			System.out.println("데이터 삽입 실패");
		}
		*/
		ArrayList<MemberDTO>list = dao.selectAll();
		if(list != null) {
			for(MemberDTO dto2 : list) {
				System.out.println(dto2.toString());
			}
		}
		
	}
}
