package com.netflix.run;

import com.netflix.dto.Basic;
import com.netflix.dto.Member;
import com.netflix.dto.Premium;
import com.netflix.dto.Standard;

public class Run {
	public static void main(String[] args) {
		Member[] list = new Member[5];
		list[0] = new Basic("abc123", "�θ���", 
				"210224", 1000);
		list[1] = new Basic("eee222", "���ξ���", 
				"210809", 1000);
		list[2] = new Standard("rrr555", "����ƾ", "200525", 2000);
		list[3] = new Premium("www999", "���ְ���", "211225", 3000);
		
		
		System.out.println("ID\t���\t�г���\t������\t����Ʈ");
		for (int i = 0; i<list.length; i++) {
			if(list[i] != null) {
				System.out.println(list[i].toString());
			}
		}
		
	}
}
