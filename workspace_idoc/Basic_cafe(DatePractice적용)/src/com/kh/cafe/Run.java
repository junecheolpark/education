package com.kh.cafe;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CafeDAO dao = new CafeDAO();
			try {
				ArrayList<CafeDTO> list = dao.selectAll();
				if (list != null) {
					for(CafeDTO dto:list) {
						System.out.println(dto.toString());
					}
				}else {
					System.out.println("데이터 조회 실패");
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		
	}
}
